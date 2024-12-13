package application.chapter.i.nineth;
//Обобщенный класс с одним парметром типа:
class MyClass<X>{
    //Поле обобщенного типа:
    X data;
    //Конструктор с аргументом обобщенного типа:
    MyClass(X data){
        //Присваивание значения полю:
        this.data=data;
    }
    //Метод для отображения значения поля:
    void show(){
        System.out.println("Значение поля: "+data);
    }
}
//Главный класс:
class UsingGenClassDemo {
    public static void main(String[] args) {
        //Создание объекта на основе обобщенного класса
        //Вместо обобщенного параметра используется
        //индетификатор Integer:
        MyClass<Integer>A=new MyClass<Integer>(100);
        //Создание объекта на основе обобщенного класса
        //Вместо обобщенного параметра используется
        //индетификатор Character:
        MyClass<Character>B=new MyClass<>('B');
        //Создание объекта на основе обобщенного класса
        //Вместо обобщенного параметра используется
        //индетификатор String:
        MyClass<String>C=new MyClass<>("Зеленый");
        //Вызов метода show() из объектов, созданных
        //на основе общественного класса:
        A.show();
        B.show();
        C.show();
    }
}
