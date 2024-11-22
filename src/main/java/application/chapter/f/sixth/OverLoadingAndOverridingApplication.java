package application.chapter.f.sixth;
//СуперКласс:
class AlphaSeventh {
    //Версия метода без аргумента:
    void show() {
        System.out.println("Класс Alpha");
    }
    //Версия метода с текстовым аргументом:
    void show(String txt){
        System.out.println(txt);
    }
}
//Подкласс:
class BravoSeventh extends AlphaSeventh{
    //Переопределение версии метода без аргументов:
    @Override
    void show(){
        System.out.println("Класс Bravo");
    }
    //Версия метода с целочислительным аргументом:
    void show(int num) {
        System.out.println("Число "+num);
    }
}
//Главный класс
class OverLoadingAndOverridingDemo {
    public static void main(String[] args) {
        //Создание объекта суперкласса:
        AlphaSeventh objA=new AlphaSeventh();
        //Вызов разных версий метода:
        objA.show();
        objA.show("Объект objA");
        //Создание объекта подкласса:
        BravoSeventh objB=new BravoSeventh();
        //Вызов разных версий метода:
        objB.show();
        objB.show("Объект objB");
        objB.show(123);
    }
}
