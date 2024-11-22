package application.chapter.f.sixth;
//Пользовательский класс:
class MyClass{
    //Текстовое поле:
    String name;
    //Целочислительное поле:
    int code;
    //Конструктор:
    MyClass(String txt,int num){
        name=txt;
        code=num;
    }
//Переопределение метода toString():
public String toString(){
       //Локальная текстовая переменная:
    String txt="Объект класса MyClass\n";
    txt+="Поле name: "+name+"\n";
    txt+="Поле code: "+code+"\n";
    //Импровизированная "линия":
    for (int k=1;k<=21;k++){
        txt+="_";
    }
    //Результат метода:
    return txt;
    }
}
//Главный класс
class UsingToStringDemo {
    //Главный метод
    public static void main(String[] args) {
        //Создание объекта:
        MyClass obj=new MyClass("Объект obj",123);
        //Объект передан аргументом методу:
        System.out.println(obj);
    }
}
