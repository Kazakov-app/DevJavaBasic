package application.chapter.i.nineth;
//Класс с обобщенным методом:
class MyClassUsingGenMethods{
    //Текстовое поле:
    String name;
    //Обобщенный метод:
    <X>void show(X arg){
        System.out.println(name+": "+arg);
    }
    //Конструктор:


    MyClassUsingGenMethods(String txt) {
        name=txt;
    }
}
//Главный класс:
class UsingGenMethodsDemo {
    //Главный метод:
    public static void main(String[] args) {
    //Создание объектов:
        MyClassUsingGenMethods A=new MyClassUsingGenMethods("Объект А");
        MyClassUsingGenMethods B=new MyClassUsingGenMethods("Объект В");
        //Вызов обобщенных методов из разных объектов:
        A.show(123);
        B.show("Alpha");
        A.show('A');
        B.show(123);
        B.show("Bravo");
        B.show("B");
    }
}
