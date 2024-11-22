package application.chapter.g.seventh;
//Первый интерфейс:
interface FirstOne{
    default void hello(){
        System.out.println("Метод из интерфейса First");
    }
}
//Второй интерфейс:
interface SecondTwo{
    default void hello(){
        System.out.println("Метод из интерфейса Second");
    }
}
//Класс реализует два интерфейса:
class MyThirdClass implements FirstOne,SecondTwo{
    //Описание метода :

    @Override
    public void hello() {
        //Вызов версии метода из интерфейса First:
        FirstOne.super.hello();
        //Вызов версии метода из интерфейса Second:
        SecondTwo.super.hello();
    }
}
//Главный класс
class MoreDefaultMethodsDemo {
    public static void main(String[] args) {
        //Создание объекта:
        MyThirdClass obj=new MyThirdClass();
        //Вызов метода:
        obj.hello();
    }
}
