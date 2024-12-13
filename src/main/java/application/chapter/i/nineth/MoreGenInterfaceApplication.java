package application.chapter.i.nineth;
//Обобщенный интерфейс: GenInterfaceApplication.MyMethods
//Создание первого класса на основе
//обобщенного интерфейса:
class AlphaMoreGenInterface implements MyMethods<Integer>{
    //Закрытое поле целочислительного типа:
    private Integer value;
    //Описание методов из интерфейса:

    @Override
    public Integer get() {
        return value;
    }
    @Override
    public void set(Integer arg) {
        value=arg;
    }
    //Метод для отображения значения поля:
    void show(){
        System.out.println("Целочислительное поле: "+get());
    }
    //Конструктор:
    AlphaMoreGenInterface(Integer arg){
        value=arg;
    }
}
//Создание второго класса на основе
//обощенного интерфейса:
class BravoMoreGenInterface implements MyMethods<Character>{
    //Закрытое поле символьного типа:
    private Character value;
    //Описание методов из интерфейса:
    @Override
    public Character get() {
        return value;
    }
    @Override
    public void set(Character arg) {
        value=arg;
    }
    //Метод для отображения значения поля:
    void show(){
        System.out.println("Символьное поле: "+get());
    }
    //Конструктор:
    BravoMoreGenInterface(Character arg){
        value=arg;
    }
}
//Главный класс:
class MoreGenInterfaceDemo {
    //Главный метод:
    public static void main(String[] args) {
        //Интерфейсная переменная:
        MyMethods ref;
        //Создание объектов:
        AlphaMoreGenInterface A=new AlphaMoreGenInterface(123);
        BravoMoreGenInterface B=new BravoMoreGenInterface('A');
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
