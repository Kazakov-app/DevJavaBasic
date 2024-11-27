package application.chapter.g.seventh;
//Первый интерфейс:
interface FirstFour{
    //Объявление метода:
    String getFirst();
    //Описание метода:
    default void show(){
        System.out.println("Интерфейс First: метод show()");
    }
}
//Второй интерфейс:
interface SecondFour{
    //Объявление метода:
    String getSecond();
    //Описание метода:
    default void show(){
        System.out.println("Интерфейс Second: метод show()");
    }
}
//Суперкласс:
class BaseOne{
    //Описание метода:
    String getBase(){
        return "Класс Base";
    }
    //Описание метода:
    void show(){
        System.out.println("Класс Base: метод show()");
    }
}
//Подкласс наследует суперкласс и реализует интерфейсы:
class MySixClass extends BaseOne implements FirstFour,SecondFour{
    //Описание метода:
    @Override
    public String getFirst() {
        return "Интерфейс First";
    }
    //Описание метода:
    @Override
    public String getSecond() {
        return "Интерфейс Second";
    }
    //Описание метода:
    @Override
    public void show() {
        System.out.println("Мы используем:");
        System.out.println(getFirst());
        System.out.println(getSecond());
        System.out.println(getBase());
        //Вызов версии метода из интерфейса First:
        FirstFour.super.show();
        //Вызов версии метода из интерфейса Second:
        SecondFour.super.show();
        //Вызов версии метода из суперкласса Base:
        super.show();
    }
}
//Главный класс:
public class ExtendingAndImplementingApplication {
    public static void main(String[] args) {
        //Создание объекта подкласса:
        MySixClass obj=new MySixClass();
        //Вызов метода из объекта:
        obj.show();
    }
}
