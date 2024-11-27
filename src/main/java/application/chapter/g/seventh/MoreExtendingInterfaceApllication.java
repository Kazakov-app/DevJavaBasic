package application.chapter.g.seventh;
//Первый интерфейс:
interface FirstThree{
    //Описание метода:
    default void alpha(){
        System.out.println("Интерфейс First: метод alpha()");
    }
}
//Второй интерфейс:
interface SecondThree extends FirstThree{
    //Описание методов:
    default void alpha(){
        //Вызов версии метода из интерфейса First:
        FirstThree.super.alpha();
        System.out.println("Интерфейс Second: метод alpha()");
    }
    default void bravo(){
        System.out.println("Интерфейс Second: метод bravo()");
    }
}
//Класс реализует интерфейс:
class MyFifthClass implements SecondThree{
    //Описание метода:

    @Override
    public void bravo() {
        //Вызов версии метода из интерфейса Second
        SecondThree.super.bravo();
        System.out.println("Класс MyClass: метод bravo()");
    }
}
//Главный класс:
class MoreExtendingInterfaceDemo{
    public static void main(String[] args) {
        //Создание объекта:
        MyFifthClass obj=new MyFifthClass();
        //Вызов методов:
        obj.alpha();
        obj.bravo();
    }
}
