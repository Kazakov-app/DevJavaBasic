package application.chapter.f.sixth;
//Суперкласс:
class AlphaThird{
    //Текстовое поле:
    String name;
    //Метод для отображения значения текстового поля:
    void show(){
        System.out.println("Объект класса Alpha:");
        System.out.println("Поле name - "+name);
    }
    //Конструткор класса:
    AlphaThird(String name){
        this.name=name;
    }
}
//Подкласс
class BravoThird extends AlphaThird{
    //Целочислительное поле
    int code;
    //Переопределение метода. Новой версией метода
    //отображаются значения двух полей:
    @Override
    void show(){
        System.out.println("Объект класса Bravo:");
        System.out.println("Поле name - "+name);
        System.out.println("Поле code - "+code);
    }
    //Конструкор класса:
    BravoThird(String name,int code){
        //Вызов конструктор класса:
        super(name);
        this.code=code;
    }
}
//Главный класс:
class OverrideMethodDemo {
    //Главный метод
    public static void main(String[] args) {
        //Создание объекта суперкласса:
        AlphaThird objA=new AlphaThird("objA");
        //Создание объекта подкласса:
        BravoThird objB=new BravoThird("objB",123);
        //Вызов метода из объекта суперкласса:
        objA.show();
        //Вызов метода из объекта подкласса:
        objB.show();
    }
}
