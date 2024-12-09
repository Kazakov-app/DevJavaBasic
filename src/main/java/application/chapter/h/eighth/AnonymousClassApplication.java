package application.chapter.h.eighth;
//Абстрактный суперкласс:
abstract class BaseAnonymousClass{
    //Текстовое поле:
    private String name;
    //Конструктор:
    BaseAnonymousClass(String txt){
        name=txt;
    }
    //Метод для отображения значения текстового поля:
    void show(){
        System.out.println("Имя объекта: "+name);
    }
    //Объявление абстрактного метода:
    abstract void hello();
}
//Главный класс:
class AnonymousClassDemo {
    public static void main(String[] args) {
        //Создание объекта анонимного класса:
        BaseAnonymousClass obj=new BaseAnonymousClass("Красный") {
            @Override
            void hello() {
                System.out.println("Объект анонимного класса");
            }
        };//Завершение инструкции создания объекта
        //анонимного класса
        //Вызов метода из объекта, созданного на основе
        //анонимного класса
        obj.show();
        obj.hello();
        //Создание анонимного объекта анонимного класса
        //и вызов из этого объекта метода showAll(),
        //описаннного в анонимном классе:
        new BaseAnonymousClass("Зеленый") {
            //Описание абстрактного метода из супркласса:
            @Override
            void hello() {
                System.out.println("Анонимный объект");
            }

            //Описание нового метода:
            void showAll() {
                hello();
                show();
            }
        }.showAll();//Вызов метода
    }
}
