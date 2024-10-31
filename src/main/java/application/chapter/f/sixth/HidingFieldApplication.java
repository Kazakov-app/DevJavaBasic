package application.chapter.f.sixth;
//Суперкласс:
class AlphaFifth {
    //Текстовое поле:
    String name;
}
//Подкласс
class BravoFifth extends AlphaFifth{
    //Текстовое поле:
    String name;
    //Метод для отображения значений полей:
    void show(){
        //Значение унаследованного из суперкласса поля:
        System.out.println("Из класса Alpha: "+super.name);
        //Значение описанного в подклассе поля:
        System.out.println("Из класса Bravo: "+name);
    }
    //Конструкор:
    BravoFifth(String a,String b){
        //Вызов конструктора (по умолчанию) суперкласса:
        super();
        //Значение унаследованного из суперкласса поля:
        super.name=a;
        //Значение описанного в подклассе поля:
        name=b;
    }
}
//Главный класс:
class HidingFieldDemo {
    //Главный метод
    public static void main(String[] args) {
        //Создание объекта подкласса:
        BravoFifth objB=new BravoFifth("alpha","bravo");
        //Вызов метода из объекта подкласса:
        objB.show();
    }
}
