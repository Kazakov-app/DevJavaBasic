package application.chapter.i.nineth;
//Суперкласс:
class BaseGenTypeExtending{
    //Текстовое поле:
    String name;
    //Конструктор:

    BaseGenTypeExtending(String txt) {
        name = txt;
    }
    //Метод для отображения значения поля:
    void show(){
        System.out.println("Текстовое поле: "+name);
    }
}
//Подкласс суперкласса Base:
class AlphaGenTypeExtending extends BaseGenTypeExtending{
    //Целочислительное поле:
    int number;
    //Конструктор:

    AlphaGenTypeExtending(String txt, int n) {
        //Вызов конструктора суперкласса:
        super(txt);
        //Присваивание значения целочислительному полю:
        number = n;
    }
    //Переопределение метода:

    @Override
    void show() {
        //Вызов метода из суперкласса:
        super.show();
        //Отображение значение целочислительного поля:
        System.out.println("Целочислительное поле: "+number);
    }
}
//Подкласс суперкласса Alpha:
class BravoGenTypeExtending extends AlphaGenTypeExtending{
    //Символьное поле:
    char symbol;
    //Конструктор:

    BravoGenTypeExtending(String txt, int n, char s) {
        //Вызов конструктора суперкласса:
        super(txt, n);
        //Присваивание значения символьному полю:
        symbol = s;
    }
    //Переопределение метода:

    @Override
    void show() {
        //Вызов версии метода из суперкласса:
        super.show();
        //Отображение значение символьного поля:
        System.out.println("Символьное поле: "+symbol);
    }
}
//Обобщенный класс:
class MyClassGenTypeExtending<X extends BaseGenTypeExtending>{
    //Поле обобщенного типа:
    X obj;
    //Конструктор:


    MyClassGenTypeExtending(X obj) {
        //Значение поля:
        this.obj = obj;
    }
    //Метод обобщенного класса:
    void show(){
        System.out.println("Объект класса MyClass");
        //Вызов метода из поля обобщенного типа:
        obj.show();
    }
}
//Главный класс:
class GenTypeExtendingDemo {
    //Главный метод:
    public static void main(String[] args) {
        //Объекты создаются на основе обобщенного класса:
        MyClassGenTypeExtending<AlphaGenTypeExtending> A=new MyClassGenTypeExtending<>(new AlphaGenTypeExtending
                ("Alpha",123));
        MyClassGenTypeExtending<BravoGenTypeExtending> B=new MyClassGenTypeExtending<>(new BravoGenTypeExtending
                ("Bravo",321,'B'));
        //Вызов метода show() из объектов:
        A.show();
        B.show();
    }
}
