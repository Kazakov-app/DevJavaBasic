package application.chapter.i.nineth;
//Обобщенный класс:
class MyClassUsingWildcard<T>{
    //Поле обобщенного типа:
    T value;
    //Конструктор:

    MyClassUsingWildcard(T val) {
        value = val;
    }
}
//Главный класс:
class UsingWildcardDemo {
    //Статический обобщенный метод
    //(используется параметр обощенного типа):
    static <T> void show(MyClassUsingWildcard<T>obj){
        System.out.println("Вызов метода show():");
        //Отображение значения поля:
        System.out.println(obj.value);
    }
    //Статический метод, в которм используется
    //обобщенна яподстановка:
    static void display(MyClassUsingWildcard<?>obj){
        System.out.println("Вызов метода display():");
        //Отображение значения поля:
        System.out.println(obj.value);
    }
    //Главный метод:
    public static void main(String[] args) {
        //При создании объекта явно указано значение
        //для обобщенного типа:
        MyClassUsingWildcard<Integer> A=new MyClassUsingWildcard<>(100);
        //При создании объекта не указано значение
        //для обобщенного типа:
        MyClassUsingWildcard B=new MyClassUsingWildcard<>('B');
        //При создании объекта использована
        //обобщенная подстановка:
        MyClassUsingWildcard<?> C=new MyClassUsingWildcard<>("Объект С");
        //Примеры вызова методов show() и display()
        //с разными аргументами:
        show(A);
        display(A);
        show(B);
        display(B);
        show(A);
        display(B);
    }

}
