package application.chapter.j.tenth;
//Функциональный интерфейс:
interface MyInterfaceThree{
    //Метод с целочислительным аргументом возвращает
    //целочислительный результат:
    int getNumber(int n);
}
//Класс с полем интерфейсного типа:
class MyClassThree{
    //Закрытое поле интерфейсного типа:
    private MyInterfaceThree ref;
    //Конструктор:

    MyClassThree(MyInterfaceThree mi) {
        set(mi);
    }
    //Метод для присваивания значения полю:
    void set(MyInterfaceThree mi){
        ref=mi;
    }
    //Метод с целочислительным аргументом возвращает
    //результатом целое число:
    int get(int n){
        //Вызов метода из объекта, на которое ссылается
        //поле интерфейсного типа:
        return ref.getNumber(n);
    }
}
//Главный класс:
class LambdaAsFieldDemo {
    //Главный метод:
    public static void main(String[] args) {
        //Создание объекта класса с передачей аргументом
        //конструктору лямда-выражения:
        MyClassThree obj=new MyClassThree((int n)->{return n*n;});
        //Проверка результата:
        System.out.println("Аргумент:");
        for(int k=0;k<=5;k++){
            System.out.print(k+"\t");
        }
        System.out.println("\nАргумент в квадрате:");
        for(int k=0;k<=5;k++){
            System.out.print(obj.get(k)+"\t");
        }
        //Полю объекта присваивается новое значение:
        obj.set((int n)->{return n*n*n;});
        //Проверка результата:
        System.out.println("\nАргумент в кубе:");
        for(int k=0;k<=5;k++){
            System.out.print(obj.get(k)+"\t");
        }
        System.out.println("");
    }
}
