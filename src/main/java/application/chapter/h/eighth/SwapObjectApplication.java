package application.chapter.h.eighth;
//Класс для создания объектов:
class MyClassSwapObject{
    //Целочислительное поле:
    int number;
    //Конструктор:
    MyClassSwapObject(int n){
        number=n;
    }
}
class SwapObjectDemo {
    static void swap(MyClassSwapObject A,MyClassSwapObject B) {
        System.out.println("Выполняется метод swap()");
        //Значение поля number объектов, переданных
        //аргументами методу:
        System.out.println("Объект A: " + A.number);
        System.out.println("Объект B: " + B.number);
        //Аргументы "обмениваются" значениями:
        MyClassSwapObject X = B;
        B = A;
        A = X;
        //(после "обмена" значениями Аргументов):
        System.out.println("Значения аргументов изменены");
        System.out.println("Объект A: " + A.number);
        System.out.println("Объект B: " + B.number);
        System.out.println("Завершено выполнение метода swap()");
    }
    public static void main(String[] args) {
        //Создание объектов:
        MyClassSwapObject A=new MyClassSwapObject(100);
        MyClassSwapObject B=new MyClassSwapObject(200);
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
