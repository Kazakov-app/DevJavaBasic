package application.chapter.j.tenth;
//Класс:
class MyClassSecond{
    //Закрытое целочислительное поле:
    private int number;
    //Конструктор:
    MyClassSecond(int n) {
        number=n;
    }
    //Метод для присваивания значения полю:
    void set(int n) {
        number=n;
    }
    //Метод для считывания значения поля:
    int get() {
        return number;
    }
}
//Первый функциональный интерфейс:
interface MyGetterSecond{
    int myGet(MyClassSecond obj);
}
//Второй функциональный интерфейс:
interface MySetterSecond{
    void mySet(MyClassSecond obj,int n);
}
//Главный класс:
class MethReferenceDemo {
    //Главный метод:
    public static void main(String[] args) {
        //Создание объекта:
        MyClassSecond obj=new MyClassSecond(100);
        System.out.println("Создан объекта с полем 100");
        //Используем ссылки на методы:
        MyGetterSecond A=MyClassSecond::get;
        MySetterSecond B=MyClassSecond::set;
        //Проверяем "значение поля" вызовом метода myGet()
        //Из интерфейсной переменной А:
        System.out.println("Переменная А: "+A.myGet(obj));
        //Проверяем значение поля объекта:
        System.out.println("Переменная obj: "+obj.get());
        //Полю объекта присваивается значение:
        obj.set(200);
        System.out.println("Полю присвоено значение 200");

        //Проверяем "значение поля" вызовом метода myGet()
        //Из интерфейсной переменной А:
        System.out.println("Переменная А: "+A.myGet(obj));
        //Присваиваем "значениее полю" вызовом метода mySet()
        //Из интерфейсной переменной В:
        B.mySet(obj,300);
        System.out.println("Выполнена команда B.mySet(obj,300)");

        //Проверяем "значение поля" вызовом метода myGet()
        //Из интерфейсной переменной А:
        System.out.println("Переменная А: "+A.myGet(obj));
        //Проверяем значение поля объекта:
        System.out.println("Переменная obj: "+obj.get());
        //Создается новый объект:
        obj=new MyClassSecond(400);
        System.out.println("Создан объект с полем 400");

        //Проверяем "значение поля" вызовом метода myGet()
        //Из интерфейсной переменной А:
        System.out.println("Переменная А: "+A.myGet(obj));
        //Проверяем значение поля объекта:
        System.out.println("Переменная obj: "+obj.get());
        //Присваиваем "значение полю" вызовом метода mySet()
        //Из интерфейсной переменной B:
        B.mySet(obj,500);
        System.out.println("Выполнена команда B.mySet(obj,500)");

        //Проверяем "значение поля" вызовом метода myGet()
        //Из интерфейсной переменной А:
        System.out.println("Переменная А: "+A.myGet(obj));
        //Проверяем значение поля объекта:
        System.out.println("Переменная obj: "+obj.get());
    }
}
