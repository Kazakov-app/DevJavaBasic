package application.chapter.f.sixth;

//Суперкласс:
class Alpha{
    //Текстовое поле:
    String name;
    //Целочислительное поле:
    int code;
    //Конструктор с тремя аргументами:
    Alpha(String name,int code){
        this.name=name;
        this.code=code;
        System.out.println("Класс Alpha:");
        System.out.println("Поле name- "+this.name);
        System.out.println("Поле code- "+this.code);
    }
    //Конструктор с одним текстовым аргументом:
    Alpha(String name){
        //Вызов конструктор с двумя аргументами:
        this(name,0);
    }
    //Конструктор с одним целочислительным аргументом
    Alpha(int code){
        //Вызов контурктоа с двумя аргументами:
        this("Белый",code);
    }
    //Конструктор без аргументов
    Alpha(){
        this("Желтый",1);
    }
}
//Подкласс:
class Bravo extends Alpha{
    //Символьное поле:
    char symbol;
    //Закрытый метод для отображения значения
    //символьного поля:
    private void show(){
        System.out.println("Класс Bravo:");
        //Отображение значения символьного поля:
        System.out.println("Поле symbol- "+this.symbol);
        //Отображение "горизонтальной линии":
        for(int k=1;k<=18;k++){
            System.out.print("-");
        }
        System.out.println("");
    }
    //Конструктор с тремя аргументами:
    Bravo(String name,int code,char symbol){
        //Вызов конструктора суперкласса
        //с двумя аргументами:
        super(name, code);
        //Присваивание символьному полю значения:
        this.symbol=symbol;
        //Вызов закрытого метода:
        show();
    }
    //Конструктор с одним символьным аргументом:
    Bravo(char symbol){
        //Вызов конструктора суперкласса без аргументов:
        super();
        //Присваивание символьному полю значения:
        this.symbol=symbol;
        //Вызов закрытого метода:
        show();
    }
    //Конструктор с одним текстовым аргументом:
    Bravo(String name){
        //Вызов конструктора суперкласса
        //с одним текстовым аргументом:
        super(name);
        //Присваивание символьному полю значения:
        this.symbol='A';
        //Вызов закрытого метода:
        show();
    }
    //Конструктор с одним целочислительным аргументом:
    Bravo(int code){
        //Вызов конструктора суперкласса
        //с одним целочислительным аргументом:
        super(code);
        //Присваивание символьному полю значения:
        this.symbol='B';
        //Вызов закрытого метода:
        show();
    }
    //Конструктор без аргументов:
    Bravo(){
        //Сначало неявно вызывается конструктор
        //суперкласса без аргументов.
        //Присваивание значения символьному полю:
        this.symbol='C';
        //Вызов закрытого метода:
        show();
    }
    //Конструктор с двумя аргументами:
    Bravo(String name,int code){
        //Вызов конструктора подкласса с тремя аргументами:
        this(name,code,'D');
    }
}
//Класс с главным методом программы:
class SubclassConstructorDemo {
    public static void main(String[] args){
        //Объектная переменная подкласса:
        Bravo obj;
        //Разные способы создания объекта подкласса:
        obj=new Bravo();
        obj=new Bravo("Красный");
        obj=new Bravo(100);
        obj=new Bravo("Зеленый",200);
        obj=new Bravo('Y');
        obj=new Bravo("Синий",300,'Z');
    }
}
