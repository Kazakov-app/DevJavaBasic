package application.chapter.f.sixth;

//Суперкласс:
class AlphaEighth{
    //текстовое поле:
    String name;
    //Метод для отображения значения поля:
    void show(){
        //Локальная текстовая переменная:
        String txt="Объект класса Alpha\n";
        txt+="Поле name: "+name+"\n";
        for(int k=1;k<=20;k++){
            txt+="_";
        }
        //Отображение сообщения:
        System.out.println(txt);
    }
}
//Подкласс:
class BravoEighth extends AlphaEighth{
    //Целочислительное поле:
    int code;
    //Переопределение метода:

    @Override
    void show() {
        //Локальная текстовая переменная:
        String txt="Объект класса Bravo\n";
        txt+="Поле name: "+name+"\n";
        txt+="Поле code: "+code+"\n";
        for(int k=1;k<=20;k++){
            txt+="_";
        }
        //Отображение сообщения:
        System.out.println(txt);
    }
}
//Главный класс
class SuperAndSubDemo {
    //Главный метод
    public static void main(String[] args) {
        //Создание объекта суперкласса:
        AlphaEighth objA=new AlphaEighth();
        //Присваивание значения полю объекта суперкласса:
        objA.name="alpha";
        //Вызов метода из объекта суперкласса:
        objA.show();
        //Создание объекта подкласса:
        BravoEighth objB=new BravoEighth();
        //Присваивание значений полям объекта подкласса:
        objB.name="bravo";
        objB.code=123;
        //Вызов метода из объекта подкласса:
        objB.show();
        //Переменной суперкласса значением присваивается
        //ссылка на объект подкласса:
        objA=objB;
        //Значение поля объекта подкласса изменяется
        //через переменную суперкласса:
        objA.name="charlie";
        //Вызов метода из объекта подкласса
        //через переменную суперкласса:
        objA.show();
        //Вызов метода из объекта подкласса
        //через переменную подкласса:
        objB.show();
    }
}
