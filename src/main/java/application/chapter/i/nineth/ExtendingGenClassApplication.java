package application.chapter.i.nineth;
//Обобщенный класс:
class BaseExtendingGenClass<X>{
    //Обощенное поле:
    X data;
    //Конструктор:
    BaseExtendingGenClass(X data) {
        this.data = data;
    }
    //Метод для отображения значения поля:
    void show(){
        System.out.println(data);
    }
}
//Подкласс на основе обобщенного класа с целочисленным
//типом вместо общественного:
class AlphaExtendingGenClass extends BaseExtendingGenClass<Integer>{
    AlphaExtendingGenClass(Integer n) {
        super(n);
    }
    //Переопределение метода:

    @Override
    void show() {
        System.out.print("Целочисленное поле: ");
        //Вызов версии метода из суперкласса:
        super.show();
    }
}
//Подкласс на основе обобщенного класса с текстовым
//типом вместо обобщенного:
class BravoExtendingGenClass extends BaseExtendingGenClass<String>{
    //Конструктор

    public BravoExtendingGenClass(String txt) {
        super(txt);
    }
    //Переопределение метода

    @Override
    void show() {
        System.out.print("Текстовое поле: ");
        //Вызов метода из суперкласса:
        super.show();
    }
}
//Подкласс на основе обобщенного класса с символьным
//типом вместо обобщенного:
class CharlieExtendingGenClass extends BaseExtendingGenClass<Character>{
    //Конструктор:

    public CharlieExtendingGenClass(Character s) {
        super(s);
    }
    //Переопредление метода:

    @Override
    void show() {
        System.out.print("Символьное поле: ");
        //Вызов метода из суперкласса:
        super.show();
    }
}
//Главный класс:
class ExtendingGenClassDemo {
    //Главный метод:
    public static void main(String[] args) {
        //Создание объектов:
        AlphaExtendingGenClass A=new AlphaExtendingGenClass(123);
        BravoExtendingGenClass B=new BravoExtendingGenClass("Объект В");
        CharlieExtendingGenClass C=new CharlieExtendingGenClass('C');
        //Вызов метода show() Из разных объектов:
        A.show();
        B.show();
        C.show();
    }
}
