package application.chapter.h.eighth;
//Абстрактный суперкласс:
abstract class BaseObjectFactory{
    //ОБъявление абстрактного метода:
    abstract void show();
}
//Производные классы:
class AlphaObjectFactory extends BaseObjectFactory{
    @Override
    void show() {
        System.out.println("Объект класа Alpha");
    }
}
class BravoObjectFactory extends BaseObjectFactory{
    @Override
    void show() {
        System.out.println("Объект класса Bravo");
    }
}
class CharlieObjectFactory extends BaseObjectFactory{
    @Override
    void show() {
        System.out.println("Объект класса Charlie");
    }
}
//Главный класс:
class ObjectFactoryDemo {
    //Статический метод для создания объектов
    //разных классов:
    static BaseObjectFactory createObject(int n){
        if(n==1) return new AlphaObjectFactory();
        if(n==2) return new BravoObjectFactory();
        return new CharlieObjectFactory();
    }
    //Главный метод программы:
    public static void main(String[] args) {
        //Объектная переменная абстрактного суперкласса:
        BaseObjectFactory obj;
        for(int k=1;k<=3;k++){
            //Создание объекта:
            obj=createObject(k);
            //Вызов из объекта метода:
            obj.show();
        }
    }
}
