package application.chapter.g.seventh;
//Интерфейс с методом, имеющий код под умолчанию:
interface BaseSecond{
    //Метод с кодом по умолчанию:
    default void show(String txt){
        System.out.println("Интерфейс Base: "+txt);
    }
    //Объявление метода:
    void hello();
}
//Класс реализует интерфейс Base
class AlphaSecond implements BaseSecond{
    //Описание обычного метода:
    @Override
    public void hello() {
        System.out.println("Объект класса Alpha");
    }
    //Описание метода с кодом по умолчанию:

    @Override
    public void show(String txt) {
        System.out.println("Класс Alpha: "+txt);
    }
}
//Класс реализует интерфейс Base:
class BravoSecond implements BaseSecond{
    //Описание обычного метода:

    @Override
    public void hello() {
        System.out.println("Объект класса Bravo");
    }
}
//Главный класс
class UsingDefaultMethodsDemo {
    public static void main(String[] args) {
        //Интерфейсная переменная:
        BaseSecond ref;
        //Объект класса Alpha:
        AlphaSecond objA=new AlphaSecond();
        //Вызов методов через объектную переменную:
        objA.hello();
        objA.show("объектная переменная objA");
        //Интерфейсной переменной присваивается ссылка
        //на объект класса Alpha:
        ref=objA;
        //Вызов метода через интерфейсную переменную:
        ref.show("интерфейсная переменая ref");
        //Объект класса Bravo:
        BravoSecond objB=new BravoSecond();
        //Вызов методов через объектную переменную:
        objB.hello();
        objB.show("объектная переменная objB");
        //Интерфейсной переменной присваивается ссылка
        //на объект класса Bravo:
        ref=objB;
        //Вызов метода через интерфейсную переменную:
        ref.show("интерфейсная переменая ref");
    }
}
