package org.example.application.chapter.third;

//Описание класса:
class StillMyClass{
    //Поля класса:
    int number;
    char symbol;
    //Конструктор класса без аргументов:
    StillMyClass(){
        number=100;
        symbol='A';
    }
    //Конструктор класса c двумя аргументов:
    StillMyClass(int n, char s){
        number=n;
        symbol=s;
    }
    //Метод для отображения значений полей объекта
    void show(){
        System.out.println("Значение полей "+number+" и "+symbol);
    }
}


//Описание класса с главным методом программы:
class UsingConstructorDemo {
    //Главный метод программы:
    public static void main(String[]args){
        //Создание первого объекта
        //(вызывается конструктор без аргументов)
        StillMyClass objA=new StillMyClass();
        //Создание пвторого объекта
        //(вызывается конструктор с двумя аргументами)
        StillMyClass objB=new StillMyClass(200,'B');
        //Отображение значений полей первого объекта:
        System.out.println("Объект objA");
        objA.show();
        //Отображение значений полей второго объекта:
        System.out.println("Объект objB");
        objB.show();
    }
}
