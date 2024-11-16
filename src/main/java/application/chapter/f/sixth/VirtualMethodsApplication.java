package application.chapter.f.sixth;

//Суперкласс:
class AlphaSixth{
    //Текстовое поле:
    String name;
    //Метод для отображения сообщения:
    void objectCreated(){
        System.out.println("Создан объект класса Alpha");
    }
    //Метод для отображения сообщения:
    void hello(){
        System.out.println("Объект класса Alpha");
    }
    //Метод для отображения значения поля:
    void show(){
        //Вызов метода для отображения сообщения:
        hello();
        //Отображение значения поля:
        System.out.println("Поле name: "+name);
    }
    //Конструктор:
    AlphaSixth(String txt){
        //Вызов метода для отображения сообщения:
        objectCreated();
        //Присваивание значения полю:
        name=txt;
    }
}
//Подкласс:
class BravoSixth extends AlphaSixth{
    //Переопределение метода:
    @Override
    void objectCreated(){
        System.out.println("Создан объект класса Bravo");
    }
    //Переопределени метода:
    @Override
    void hello(){
        System.out.println("Объект класса Bravo");
    }
    //Констурктор:
    BravoSixth(String txt){
        //Вызов конструктора суперкласса:
        super(txt);
    }
}
//Главный класс:
class VirtualMethodsDemo {
    //Главный метод:
    public static void main(String[] args) {
        //Создание объекта суперкласса:
        AlphaSixth objA=new AlphaSixth("Alpha");
        //Отображение значение поля:
        objA.show();
        //Создание объекта подкласса:
        BravoSixth objB=new BravoSixth("Bravo");
        //Отображжение значение поля:
        objB.show();
    }
}
