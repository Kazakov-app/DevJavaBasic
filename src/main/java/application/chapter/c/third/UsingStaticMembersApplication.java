package application.chapter.c.third;

//Описание класса со статическими членами:
class MyFifthClass {
    //Статическое поле:
    static int count=0;
    //Конструктор класса без аргументов:
    MyFifthClass(){
       //Увеличение значения статического поля:
        count++;
        //Отображение сообщения:
        System.out.println("Создан объект номер "+count);
    }
    //Статический метод для отображения
    static void show(){
        System.out.println("Количество объектов: "+count);
    }
}


//Описание класса с главным методом программы:
class UsingStaticMembersDemo {
    //Главный метод программы:
    public static void main(String[]args){
        //Вызов статического метода:
        MyFifthClass.show();
        //Создание объектов:
        MyFifthClass objA=new MyFifthClass();
        MyFifthClass objB=new MyFifthClass();
        MyFifthClass objC=new MyFifthClass();
        //Вызов статического метода через ссылку на класс:
        MyFifthClass.show();
        //Вызов статического метода через ссылку на объект:
        objC.show();
        objB.show();
        objA.show();
    }
}
