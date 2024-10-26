package application.chapter.c.third;

//Описание класса со статическими членами:
class MySixthClass {
    //закрытое статическое поле:
    private static int count=0;
    //закрытые нестатическое поля:
    private int number;
    private String name;
    //Конструктор без аргументов:
    MySixthClass(String n){
        //Увеличение значения статического поля:
        count++;
        //Присваивание значений нестатическим полям:
        name=n;
        number=count;
        //Отображение сообщения:
        System.out.println("Создан объект c именем "+name);
    }
    //Метод для отображения сообщения:
    public void show(){
        System.out.println("Название объекта: "+name);
        System.out.println("Номер объекта: "+number);
        System.out.println("Количество объектов: "+count);
    }
    //Метод для присваивания значения закрытому
    //текстовому полю:
    public void set(String n){
        name=n;
    }
}


//Описание класса с главным методом программы:
class UsingPrivateMembersDemo {
    //Главный метод программы:
    public static void main(String[]args){
        //Создание объектов:
        MySixthClass objA=new MySixthClass("Alpha");
        MySixthClass objB=new MySixthClass("Bravo");
        MySixthClass objC=new MySixthClass("Charlie");
        //Вызов метода для каждого объекта:
        objA.show();
        objB.show();
        objC.show();
        //Изменение поля второго объекта:
        objB.set("Второй Объект");
        //Отоюражение значений полей объекта:
        objB.show();
    }
}
