package application.chapter.f.sixth;
//Суперкласс:
class AlphaFourth{
    //Текстовое поле:
    String name;
    //Метод для отображения значения текстового поля:
    void show(){
        System.out.println("Объект класса:"+name);
    }
    //Конструткор класса:
    AlphaFourth(String name){
        this.name=name;
    }
}
//Подкласс
class BravoFourth extends AlphaFourth{
    //Целочислительное поле
    int code;
    //Вызов версии метода из суперкласса:
    @Override
    void show(){
        super.show();
        System.out.println("Числовое поле "+code);
    }
    //Конструкор класса:
    BravoFourth(String name,int code){
        //Вызов конструктор класса:
        super(name);
        this.code=code;
    }
}
//Главный класс:
class MoreOverrideDemo {
    //Главный метод
    public static void main(String[] args) {
        //Создание объекта суперкласса:
        AlphaFourth objA=new AlphaFourth("objA");
        //Создание объекта подкласса:
        BravoFourth objB=new BravoFourth("objB",123);
        //Вызов метода из объекта суперкласса:
        objA.show();
        //Вызов метода из объекта подкласса:
        objB.show();
    }
}
