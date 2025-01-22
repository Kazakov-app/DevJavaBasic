package application.chapter.l.twelvth;
//Статический импорт:
import static javax.swing.JOptionPane.*;
class DaemonThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        //Создание объекта для дочернего потока.Первый
        //аргумент конструктора является лямбда-выражением,
        //второй аргумент-название потока:
        Thread t=new Thread(()->{
            //Индексная переменная и
            //переменная для записи суммы чисел:
            int k=1,s=0;
            //бесконечный цикл для вычисления суммы:
            while(true){
                //Отображение сообщения:
                System.out.println(Thread.currentThread().getName()+": "+s);
                try{
                    //Задержка в выполнении потока:
                    Thread.sleep(1000);
                }//Обработка исключения:
                catch (InterruptedException e){}
                    //Прибавление слагаемого к сумме:
                    s+=k;
                    //Увеличение знаяения индексной переменной:
                    k++;
                }
            },"Вычисление суммы");
        //Статус демон-потока:
        t.setDaemon(true);
        //Переменная для записи результата
        //выбор пользователя (нажатая кнопка):
        int res;
        //Запуск потока на выполнение:
        t.start();
        //Отображение диалогового окна:
        do{
            //задержка в выполенении потока:
            Thread.sleep(3000);
            //Отображение окна и запоминание
            //выбора пользователя:
            res=showConfirmDialog(null,
                    //Текст в окне:
                    "Закончить вычисление суммы?",
                    //Название окна:
                    "Сумма чисел",
                    //Кнопки в окне:
                    YES_NO_OPTION);
        }while (res!=YES_OPTION);
    }
}
