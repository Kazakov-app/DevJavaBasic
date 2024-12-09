package application.chapter.h.eighth;
//Инерфейс
interface BaseMoreAnonymousClass{
    //Метод с кодом по умолчанию:
    default void show(){
        System.out.println("Интерфейс Base");
    }
    //Объявление метода:
    void hello();
}
//Главный класс:
class MoreAnonymousClassDemo {
    public static void main(String[] args) {
        //Создание объекта анонимного класса:
        BaseMoreAnonymousClass obj=new BaseMoreAnonymousClass() {
            @Override
            public void hello() {
                System.out.println("Объект анонимного класса");
            }
        };//Заврешние инструкциисоздания объекта
        //анонимного класса
        //Вызов методов из объекта, созданного на основе
        //анонимного класса:
        obj.show();
        obj.hello();
        //Создание анонимного объекта анонимного класса
        //и вызов из этого объекта метода showAll(),
        //описанного в анонимном класса:
        new BaseMoreAnonymousClass() {
            //Описание метода из интерфейса:
            @Override
            public void hello() {
                System.out.println("Анонимный объект");
            }
        //Описание нового метода:
            void showAll(){
                hello();
                show();
            }
        }.showAll();//Вызов метода
    }
}
