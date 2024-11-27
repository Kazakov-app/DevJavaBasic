package application.chapter.h.eighth;
//Суперкласс:
class BaseCopyConstructor{
    //Тектовое поле:
    String name;
    //Конструткор с текстовым аргументом:
    BaseCopyConstructor(String txt){
        name=txt;
    }
    //Конструктор создания копии:
    BaseCopyConstructor(BaseCopyConstructor obj){
        name=obj.name;
    }
}
//Подкласс:
class MyClassCopyConstructor extends BaseCopyConstructor{
    //Целочислительное поле:
    int code;
    //Конструктор с текстовым и целочислительным полем:
    MyClassCopyConstructor(String txt,int n){
        //Вызов конструктора суперкласса:
        super(txt);
        //Присваивание значения целочислительному полю:
        code=n;
    }
    //Конструктор создания копии:
    MyClassCopyConstructor(MyClassCopyConstructor obj){
        //Вызов конструктора суперкласса:
        super(obj);
        //Присвваивание значения целочислительному полю:
        code= obj.code;
    }
    //Метод для отображения полей:
    void show(){
        //Значение текстового поля:
        System.out.println("Текстовое поле: "+name);
        //Значение целочислительного поля:
        System.out.println("Целочислительное поле: "+code);
    }
}
//Главный класс:
class CopyConstructorDemo {
    public static void main(String[] args) {
        //Создание объекта с вызовом конструктора
        //с двумя аргументами:
        MyClassCopyConstructor A=new MyClassCopyConstructor("Желтый",200);
        //Создание объекта с вызовом конструктора
        //создания копии
        MyClassCopyConstructor B=new MyClassCopyConstructor(A);
        //Изменение значений полей первого объекта:
        A.name="Красный";
        A.code=100;
        //Создание объекта с вызовом конструктора
        //создание копии(аргумент-анонимный объект):
        MyClassCopyConstructor C=new MyClassCopyConstructor(new MyClassCopyConstructor("Зеленый",300));
        //Отображение значений полей:
        System.out.println("Объект А");
        A.show();
        System.out.println("Объект B");
        B.show();
        System.out.println("Объект C");
        C.show();
    }
}
