package application.chapter.h.eighth;
//Класс для создания объектов:
class MyClassSwapFields{
    //Целочислительное поле:
    int number;
    //Конструктор:
    MyClassSwapFields(int n){
        number=n;
    }
}
//Класс со статическим методом swap() и главным
//методом программы:
class SwapFieldsDemo {
    //Статический метод с двумя аргументами, являющимися
    //объектами класса MyClass
    static void swap(MyClassSwapFields A,MyClassSwapFields B){
        System.out.println("Выполняется метод swap()");
        //Значение поля number объектов, переданных
        //аргументами методу:
        System.out.println("Объект A: "+A.number);
        System.out.println("Объект B: "+B.number);
        //Объекты "обмениваются" значениями полей:
        int number= B.number;
        B.number= A.number;
        A.number=number;
        //Значения поля number объектов, переданных
        //аргументами методу swap()
        //(после "обмена" значениями полей):
        System.out.println("Значения полей изменены");
        System.out.println("Объект A: "+A.number);
        System.out.println("Объект B: "+B.number);
        System.out.println("Завершено выполнение метода swap()");
    }
    //Главный метод программы:
    public static void main(String[] args) {
        //Создание объектов:
        MyClassSwapFields A=new MyClassSwapFields(100);
        MyClassSwapFields B=new MyClassSwapFields(200);
        //Значение поля number объектов А и В до
        //вызова метода swap():
        System.out.println("До вызова метода swap(): A.number="+A.number+" и B.number="+B.number);
        //Вызов метода swap():
        swap(A,B);
        //Значение поля number объектов A и В после
        //вызова метода swap():
        System.out.println("После вызова метода swap(): A.number="+A.number+" и B.number="+B.number);
    }
}
