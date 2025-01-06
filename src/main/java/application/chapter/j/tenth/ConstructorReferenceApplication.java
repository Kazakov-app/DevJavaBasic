package application.chapter.j.tenth;
//Класс
class MyClassConstructorReference{
    //Закрытое поле:
    private int number;
    //Конструктор:

    MyClassConstructorReference(int n) {
        number = n;
    }
    //Открытые методы:
    void show(){
        System.out.println("Значение поля: "+number);
    }
    void set(int n){
        number=n;
    }
}
//Интерфейс:
interface MyInterface{
    MyClassConstructorReference create(int n);
}
//Главный класс:
class ConstructorReferenceDemo {
    //Главный метод:
    public static void main(String[] args) {
        //Использование ссылки на конструктор:
        MyInterface ref=MyClassConstructorReference::new;
        //Создание объекта вызовом метода
        //из интерфейсной переменной:
        MyClassConstructorReference obj=ref.create(100);
        //Вызов методов объекта:
        obj.show();
        obj.set(200);
        obj.show();
    }
}
