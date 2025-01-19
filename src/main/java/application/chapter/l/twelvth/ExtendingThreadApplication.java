package application.chapter.l.twelvth;
//Подкласс класса Thread:
class MyThreadThree extends Thread{
    //Переопределение метода run():
    @Override
    public void run() {
        for (int i=1;i<=5;i++){
            System.out.println("Дочерний поток:\t"+i);
            try{
                Thread.sleep(4500);
            }
            catch (InterruptedException e){
                System.out.println("Прерывание дочернего потока");
            }
        }
    }
}
//Главный класс:
class ExtendingThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Начинается выполнение программы");
        //Создание объекта класса MyThread:
        MyThreadThree t= new MyThreadThree();
        System.out.println("Запускается дочерний поток");
        //Запуск дочернего потока:
        t.start();
        for (int k=0;k<=5;k++){
            System.out.println("Главный поток:\t"+(char)('A'+k));
            Thread.sleep(2000);
        }
        if (t.isAlive()){
            t.join();
        }
        System.out.println("Выполнение программы завершено");
    }
}
