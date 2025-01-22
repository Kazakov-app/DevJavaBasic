package application.chapter.l.twelvth;
//Класс с целочислительным полем:
class MyNumber {
    int number;
}
//Класс для создания потоков:
class MySynchronizedThread extends Thread{
    //Ссылка на объект с целочислительным полем:
    private MyNumber obj;
    //Интервал в приостановки в выполнении потока:
    private int time;
    //Количество циклов:
    private int count;
    //Поле логического типа:
    private boolean state;
    //Конструктор:

    MySynchronizedThread(String name,MyNumber obj, int time, int count, boolean state) {
        //Вызов конструктора суперкласса:
        super(name);
        //Ссылка на объект:
        this.obj = obj;
        //Интервал задержки:
        this.time = time;
        //Количество циклов:
        this.count = count;
        //Значение поля логического типа:
        this.state = state;
        //Запуск потока:
        start();
    }
    //Метод для отображения "линии" из символов:
    private void line(){
        //Локальная символьная переменная:
        char s;
        //Значение переменной:
        if(state) s='-';
        else s='*';
        //отображение последовательности символов:
        for(int k=1;k<=35;k++){
            System.out.print(s);
        }
        System.out.println("");
    }
    //Переопрделение метода run():

    @Override
    public void run() {
        //Оператор цикла:
        for(int k=1;k<=count;k++){
            //Блок синхронизации:
            synchronized (obj){
                //Отображается "линия":
                line();
                //Отображение сообщения:
                System.out.println("Поток "+getName()+": исходное значение "+obj.number);
                //Контролируемый код:
                try{
                    //Задержка в выполнении потока:
                    Thread.sleep(time);
                }//Обработка исключения:
                catch (InterruptedException e){
                    System.out.println(e);
                }
                //Изменение значения поля объекта:
                if(state) obj.number++;
                else obj.number--;
                //Отображение сообщения:
                System.out.println("Поток "+getName()+": новое значение "+obj.number);
                //Отображение "линии":
                line();
            }//Заверение блока синхронизации
        }
    }
}
//главный класс:
class SynchronizedThreadsDemo {
    //Главный метод:
    public static void main(String[] args) {
        //Целочислительные переменные:
        int n=100,count=5,time=1000,dt=200;
        //Создание объекта с целочислительным полем:
        MyNumber obj=new MyNumber();
        //Присваивание полю объекта значения:
        obj.number=n;
        //Создание первого потока:
        MySynchronizedThread Alpha=new MySynchronizedThread("Alpha",obj,time+dt,count,true);
        //Создание второго потока:
        MySynchronizedThread Bravo=new MySynchronizedThread("Bravo",obj,time-dt,count,false);
        //Контролируемый код:
        try{
            //Ожидание завершения потоков:
            if(Alpha.isAlive())Alpha.join();
            if(Bravo.isAlive())Bravo.join();
        }//Обработка исключения:
        catch (InterruptedException e){
            System.out.println(e);
        }
    }
}
