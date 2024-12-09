package application.chapter.h.eighth;
//Класс для создания объектов в цепочке:
class MyClassListOfObject{
    //Целочислительное поле:
    int number;
    //Ссылка на следующий объект в цепочке:
    MyClassListOfObject next;
}
//Главный класс:
class ListOfObjectDemo {
    //Статический метод для создания цепочки объектов:
    static MyClassListOfObject createList(int n){
        //Создание первого объекта:
        MyClassListOfObject obj=new MyClassListOfObject();
        //Целочислительное поле первого объекта:
        obj.number=1;
        //Ссылка на последний( и пока что единственный)
        //объект в цепочке:
        MyClassListOfObject t=obj;
        //Создание цепочки объектов:
        for (int k=1;k<=n;k++){
            //Создается новый объект и ссылка на него
            //записывается в поле next последнего
            //(на данный момент) объекта в цепочке
            t.next=new MyClassListOfObject();
            //Вычисление значения числового поля вновь
            //созданного объекта:
            t.next.number= t.number*(n-k+1)/k;
            //Созданный объект становится последним объектом
            // в цепочке объектов:
            t=t.next;
        }
        //Пустая ссылка для поля next последнего
        //объекта в цепочке:
        t.next=null;
        //Результат метода-ссылка на первый объект
        //в цепочке:
        return obj;
    }
    //Статический метод для отображения значений числовых
    //полей объектов из цепочки:
    static void showList(MyClassListOfObject obj){
        //Начальное значение текстовой переменной:
        String txt="| ";
        //Ссылка на первый объект в цепочке:
        MyClassListOfObject t=obj;
        //Добавление к тексту значений числовых полей:
        do{
            //К тексту дописывается значение числового поля
            //объекта, на который ссылается переменная t:
            txt+=t.number+" | ";
            //Переменная t указывает на следующий объект:
            t=t.next;
        }while (t!=null);
        //Отображение значений биноминальных коэффициентов:
        System.out.println(txt);
    }
    //Главный метод программы:
    public static void main(String[] args) {
        //Создание цепочек объектов:
        MyClassListOfObject A=createList(5);
        MyClassListOfObject B=createList(10);
        //отображение биноминальных коэффициентов:
        showList(A);
        showList(B);
    }
}
