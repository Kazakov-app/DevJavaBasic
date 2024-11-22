package application.chapter.g.seventh;
//Первый интерфейс:
interface First{
    void hello();
}
//Второй интерфейс:
interface Second{
    void hi();
}
//Класс реализует два интерфейса:
class MySecondClass implements First,Second{
    //Описание метода из первого интерфейса:
    @Override
    public void hello() {
    System.out.println("Метод из интерфейса First");
    }
    //Описнаие метода из второго интерфейса:
    @Override
    public void hi() {
        System.out.println("Метод из интерфейса Second");
    }
}
//Главный класс:
class UsingInterfacesDemo {
    public static void main(String[] args) {
        //Создание объекта
        MySecondClass obj=new MySecondClass();
        //Вызов методов из объекта:
        obj.hello();
        obj.hi();
    }
}

