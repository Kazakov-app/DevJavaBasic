package application.chapter.j.tenth;
//Первый функциональный интрефейс:
interface Alpha{
    void showA();
}
//Второй функциональный интрефейс:
interface Bravo{
    void showB();
}
//Третий функциональный интрефейс:
interface Charlie{
    void showC();
}
//Главный класс:
class LambdaAndInterfacesDemo {
    //Главный метод:
    public static void main(String[] args) {
        //Значением интерфейсной переменной присваивается
        //лямбда-выражение
        Alpha A=()-> System.out.println("Используем лямбда-выражение");
        //Вызов метода из интерфейсной переменной:
        A.showA();
        //Значением интерфейсной переменной присваивается
        //лямбда-выражение
        Bravo B=()-> System.out.println("Используем лямбда-выражение");
        //Вызов метода из интерфейсной переменной:
        B.showB();
        //Значением интерфейсной переменной присваивается
        //лямбда-выражение
        Charlie С=A::showA;
        //Вызов метода из интерфейсной переменной:
        С.showC();
    }
}