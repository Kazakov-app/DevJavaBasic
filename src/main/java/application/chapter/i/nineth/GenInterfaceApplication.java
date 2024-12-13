package application.chapter.i.nineth;
//Обобщенный интерфейс:
interface MyMethods<X>{
    X get();
    void set(X arg);
}
//Создание обобщенного класса на основе
//обобщенного интерфеса:
class MyClassGenInterface<X> implements MyMethods<X>{
    //Закрытое поле обобщенного типа:
    private X value;
    //Описание методов из интрефейса:
    @Override
    public X get(){
        return value;
    }
    @Override
    public void set(X arg){
    value=arg;
}
//Метод для отображения значения поля:
    void show(){
        System.out.println("Значение поля: "+get());
    }
    //Конструктор:

    MyClassGenInterface(X arg) {
        value = arg;
    }
}
//Главный класс:
class GenInterfaceDemo {
    //Главный метод:
    public static void main(String[] args) {
        //Интерфейсная переменная:
        MyMethods ref;
        //Создание объектов на основе обобщенного класса:
        MyClassGenInterface<Integer> A=new MyClassGenInterface<>(123);
        MyClassGenInterface<Character> B=new MyClassGenInterface<>('A');
        //Вызов метода из объекта класса:
        A.show();
        //Интерфейсной переменной присваивается значение:
        ref=A;
        //Вызов метода через интерфейсную переменную:
        ref.set(321);
        //Вызов метода метода из объектного класса:
        A.show();
        B.show();
        //Интерфейсной переменной присваивается значение:
        ref=B;
        //Вызов метода через интерфейсную переменную:
        ref.set('B');
        //Вызов метода из объекта класса:
        B.show();
    }
}
