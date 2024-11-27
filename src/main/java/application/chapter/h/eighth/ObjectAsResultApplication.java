package application.chapter.h.eighth;
//Класс
class MyClasObjectAsResult{
    //Закрытые поля:
    private int code;
    private String name;
    //Конструктор


    public MyClasObjectAsResult(int n, String s) {
        System.out.println("Создание объекта:");
        //Присваивание значений полям
        //И отображение этих значений:
        set(n,s).show();
    }
    //Метод для присваивания значения целочислительному полю
    //возвращающий результатом ссылку на объект:
    MyClasObjectAsResult set(int n){
        //Присваивание значения целочислительному полю:
        code=n;
        //Результат метода:
        return this;
    }
    MyClasObjectAsResult set(String s){
        //Присваивание значения текстовому полю:
        name=s;
        //Результат метода:
        return this;
    }
    //Метод для присваивания значений полямб
    //возвращающий результатом ссылку на объект:
    MyClasObjectAsResult set(int n, String s){
        //Присваивание значений полям и результат метода:
        return set(n).set(s);
    }
    //Метод для отображения значений полей:
    void show(){
        System.out.println("Поле code="+code);
        System.out.println("Поле name="+name);
        System.out.println("----------------");
    }
}
//Главный класс:
class ObjectAsResultDemo {
    //Статический метод для создания объекта:
    static MyClasObjectAsResult createObject(int n,String s){
        //Результат метода:
        return new MyClasObjectAsResult(n, s);
    }
    //Главный метод программы:
    public static void main(String[] args) {
        //Создание объекта:
        MyClasObjectAsResult obj=createObject(100,"alpha");
        //Изменение значения целочислительного поля
        //и отображение значений полей объекта:
        obj.set(200).show();
        //Изменение значения текстового поля
        //и отображение значений полей объекта:
        obj.set("bravo").show();
        //Отображение значений полей:
        obj.show();
        //Создание объекта, изменение значений его полей
        //и вызов метода для отображения значений полей:
        createObject(300,"charlie").set(400,"delta").show();
    }
}
