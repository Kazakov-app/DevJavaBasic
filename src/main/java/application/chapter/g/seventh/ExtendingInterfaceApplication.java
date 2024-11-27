package application.chapter.g.seventh;
//Наследуемый интерфейс:
interface FirstTwo{
    //Метод с кодом по умолчанию:
    default void alpha(){
        System.out.println("Интерфейс First: метод alpha()");
    }
    //Метод с кодом по умолчанию:
    default void bravo(){
        System.out.println("Интерфейс First: метод bravo()");
    }
    //Метод с кодом по умолчанию:
    default void charlie(){
        System.out.println("Интерфейс First: метод charlie()");
    }
    //Метод без кода по умолчанию:
    void delta();
}
//Интерфейс-наследник:
interface SecondOne extends FirstTwo{
    //Объявление метода:
    void bravo();
    //Метод с кодом по умолчанию:

    @Override
    default void charlie() {
        System.out.println("Интерфейс Second: метод charlie()");
    }
    void echo();
}
//Класс реализует интерфейс:
class MyFourthClass implements SecondOne{
    //Описание методов :
    @Override
    public void bravo() {
        System.out.println("Класс MyClass: метод bravo()");
    }

    @Override
    public void delta() {
        System.out.println("Класс MyClass: метод delta()");
    }

    @Override
    public void echo() {
        System.out.println("Класс MyClass: метод echo()");
    }
}
//Главный класс
class ExtendingInterfaceDemo {
    public static void main(String[] args) {
        //Создание объекта:
        MyFourthClass obj=new MyFourthClass();
        //Вызов методов:
        obj.alpha();
        obj.bravo();
        obj.charlie();
        obj.delta();
        obj.echo();
    }
}
