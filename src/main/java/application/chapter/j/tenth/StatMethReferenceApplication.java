package application.chapter.j.tenth;
//Класс со статическими методами:
class MyClassStatMethReference{
    //Методом отображается сообщение:
    static void show(){
        System.out.println("Метод класса MyClass");
    }
    //Методом вычисляется сумма чисел:
    static int sum(int n){
        int k,s=0;
        for(k=1;k<=n;k++){
            s+=k;
        }
        return s;
    }
}
//Первый интерфейс:
interface MyShow{
    void myShow();
}
//Второй интерфейс:
interface MySum{
    int mySum(int n);
}
//Третий интерфейс:
interface MyPrinter{
    void myPrint(Object t);
}
//Главный класс:
class StatMethReferenceDemo {
    //Главный метод:
    public static void main(String[] args) {
        //Использование ссылок на статические методы:
        MyShow A=MyClassStatMethReference::show;
        MySum B=MyClassStatMethReference::sum;
        MyPrinter P=System.out::println;
        //Вызов методов из интерфейсных переменных:
        A.myShow();
        P.myPrint("Сумма чисел: "+B.mySum(10));
    }
}
