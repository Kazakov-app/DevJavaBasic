package application.chapter.g.seventh;
//Интерфейс:
interface Base{
    //Объявление метода:
    void show();
}
//Класс реализует интерфейс Base:
class Alpha implements Base{
    //Текстовое поле:
    String word;
    //Конструктор:
    Alpha(String txt){
        word=txt;
    }
    //Описание метода из интерфейса:
    @Override
    public void show() {
        System.out.println("Объект класса Alpha");
        System.out.println("Текстовое поле: "+word);
    }
}
//Класс реализует интерфейс Base:
class Bravo implements Base{
    //Целочислительное поле:
    int number;
    //Конструктор:
    Bravo(int n){
        number=n;
    }
    //Описание метода из интерфейса:
    @Override
    public void show() {
        System.out.println("Объект класса Bravo");
        System.out.println("Целочислительное поле: "+number);
    }
}
//Главный класс
class UsingInterfaceVarsDemo {
    public static void main(String[] args) {
        //Интерфейсная переменная:
        Base ref;
        //Объект класса Alpha:
        ref=new Alpha("текст");
        ref.show();
        //Объект класса Bravo:
        ref=new Bravo(123);
        ref.show();
    }
}
