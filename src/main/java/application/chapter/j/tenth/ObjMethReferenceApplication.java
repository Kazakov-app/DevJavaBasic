package application.chapter.j.tenth;
//Класс:
class MyClass{
    //Закрытое целочислительное поле:
    private int number;
    //Конструктор:
    MyClass(int n) {
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
interface MyGetter{
    int myGet();
}
//Второй функциональный интерфейс:
interface MySetter{
    void mySet(int n);
}
//Главный класс
class ObjMethReferenceDemo {
    //Главный метод
    public static void main(String[] args) {
        //Создание объекта:
        MyClass obj=new MyClass(100);
        System.out.println("Создание объекта с полем 100");
        //Используем ссылки на методы:
        MyGetter A=obj::get;
        MySetter B=obj::set;
        //Проверяем "значение поля" вызовом метода myGet()
        //Из интерфейсной переменной А:
        System.out.println("Переменная А: "+A.myGet());
        //Проверяем значение поля объекта:
        System.out.println("Переменная obj: "+obj.get());
        //Полю объекта присваивается значение:
        obj.set(200);
        System.out.println("Полю присвоено значение 200");

        //Проверяем "значение поля" вызовом метода myGet()
        //Из интерфейсной переменной А:
        System.out.println("Переменная А: "+A.myGet());
        //Присваиваем "значениее полю" вызовом метода mySet()
        //Из интерфейсной переменной В:
        B.mySet(300);
        System.out.println("Выполнена команда B.mySet(300)");

        //Проверяем "значение поля" вызовом метода myGet()
        //Из интерфейсной переменной А:
        System.out.println("Переменная А: "+A.myGet());
        //Проверяем значение поля объекта:
        System.out.println("Переменная obj: "+obj.get());
        //Создается новый объект:
        obj=new MyClass(400);
        System.out.println("Создан объект с полем 400");

        //Проверяем "значение поля" вызовом метода myGet()
        //Из интерфейсной переменной А:
        System.out.println("Переменная А: "+A.myGet());
        //Проверяем значение поля объекта:
        System.out.println("Переменная obj: "+obj.get());
        //Присваиваем "значение полю" вызовом метода mySet()
        //Из интерфейсной переменной B:
        B.mySet(500);
        System.out.println("Выполнена команда B.mySet(500)");

        //Проверяем "значение поля" вызовом метода myGet()
        //Из интерфейсной переменной А:
        System.out.println("Переменная А: "+A.myGet());
        //Проверяем значение поля объекта:
        System.out.println("Переменная obj: "+obj.get());
    }
}
