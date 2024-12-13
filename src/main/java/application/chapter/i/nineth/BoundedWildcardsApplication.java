package application.chapter.i.nineth;
//Первый класс:
class AlphaBoundedWildcards{
    //Закрытое текстовое поле:
    private String name;
    //Конструктор:

    AlphaBoundedWildcards(String txt) {
        name = txt;
    }
    //Переопределение метода toString():
    public String toString(){
        return name;
    }
}
//Второй класс:
class BravoBoundedWildcards extends AlphaBoundedWildcards{
    //Конструктор:
    BravoBoundedWildcards(String txt) {
        //Вызов конструктора суперкласса:
        super(txt);
    }
}
//Третий класс:
class CharlieBoundedWildcards extends BravoBoundedWildcards{
    CharlieBoundedWildcards(String txt) {
        super(txt);
    }
}
//Четвертый класс:
class DeltaBoundedWildcards extends CharlieBoundedWildcards{
    DeltaBoundedWildcards(String txt) {
        super(txt);
    }
}
//Пятый класс:
class EchoBoundedWildcards extends DeltaBoundedWildcards{
    EchoBoundedWildcards(String txt) {
        super(txt);
    }
}
//Обобщенный класс:
class MyClassBoundedWildcards<T>{
    //Закрытое поле обобщенного типа:
    private T obj;
    //Переопределение метода toString():

    @Override
    public String toString() {
        return obj.toString();
    }
    //Конструктор:

    MyClassBoundedWildcards(T arg) {
        obj = arg;
    }
}
//Главный класс:
class BoundedWildcardsDemo {
    //Статический метод для отображения текстового
    //представления объекта, созданного с использованием
    //подкласса для класса Charlie:
    static void show(MyClassBoundedWildcards<? extends CharlieBoundedWildcards>obj){
        System.out.println(obj);
    }
    //Статический метод для отображения текстового
    //представления объекта, созданного с использованием
    //суперкласса для класса Charlie:
    static void display(MyClassBoundedWildcards<? super CharlieBoundedWildcards>obj){
        System.out.println(obj);
    }
    //Главный метод:
    public static void main(String[] args) {
        //Создание объктов:
        MyClassBoundedWildcards<AlphaBoundedWildcards> A=new MyClassBoundedWildcards<>(new AlphaBoundedWildcards("Объект А"));
        MyClassBoundedWildcards<BravoBoundedWildcards> B=new MyClassBoundedWildcards<>(new BravoBoundedWildcards("Объект B"));
        MyClassBoundedWildcards<CharlieBoundedWildcards> C=new MyClassBoundedWildcards<>(new CharlieBoundedWildcards("Объект C"));
        MyClassBoundedWildcards<DeltaBoundedWildcards> D=new MyClassBoundedWildcards<>(new DeltaBoundedWildcards("Объект D"));
        MyClassBoundedWildcards<EchoBoundedWildcards> E=new MyClassBoundedWildcards<>(new EchoBoundedWildcards("Объект E"));
        //Вызов методов display() и show() с передачей
        //аргументов одного из созданных объектов:
        display(A);
        display(B);
        display(C);
        show(C);
        show(D);
        show(E);
    }
}
