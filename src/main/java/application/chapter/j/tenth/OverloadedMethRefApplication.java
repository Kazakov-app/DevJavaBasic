package application.chapter.j.tenth;
//Класс:
class MyClassOverloadedMethRef{
    //Поле:
    int number;
    //Перегруженный метод:
    void set(){
        number=0;
    }
    void set(int n){
        number=n;
    }
}
//Первый интерфейс:
interface AlphaOverloadedMethRef{
    void none();
}
//Второй интерфейс:
interface BravoOverloadedMethRef{
    void one(int n);
}
//Главный класс:
class OverloadedMethRefDemo {
    //Главный метод:
    public static void main(String[] args) {
        //Создание объекта:
        MyClassOverloadedMethRef obj=new MyClassOverloadedMethRef();
        //Использование ссылки на перегруженный метод:
        AlphaOverloadedMethRef A=obj::set;
        BravoOverloadedMethRef B=obj::set;
        //Вызов метода через интерфейсную переменную:
        B.one(100);
        //Проверка значения поля объекта:
        System.out.println("Значение поля: "+obj.number);
        //Вызов метода через интерфейсную переменную:
        A.none();
        //Проверка значения поля объекта:
        System.out.println("значения поля: "+obj.number);
    }
}
