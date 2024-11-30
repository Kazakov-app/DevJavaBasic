package application.chapter.h.eighth;
//Класс с целочислительным полем:
class MyClassArrayOfObjects{
    //Закрытое целочислителное поле:
    private int number;
    //Конструктор:
    MyClassArrayOfObjects(int n){
        number=n;
    }
    //метод для считывания значения поля:
    int get(){
        return number;
    }
}
//Главный класс:
class ArrayOfObjectsDemo {
    //Статический метод для создания массива объектов:
    static MyClassArrayOfObjects[] createBinoms(int n){
        //Создание массива из объектных переменных:
        MyClassArrayOfObjects[]bins=new MyClassArrayOfObjects[n+1];
        //Создание объекта, ссылка на который записывается
        //в начальный элемент массива:
        bins[0]=new MyClassArrayOfObjects(1);
        //Создание объектов и заполнение массива:
        for (int k=1;k<=n;k++){
            //Создается новый объект и ссылка на него
            //присваивается значением элементу массива:
            bins[k]=new MyClassArrayOfObjects(bins[k-1].get()*(n-k+1)/k);
        }
        //Результат метода:
        return bins;
    }
    //Статический метод для отображения значений полей
    //объектов, формирующих массив:
    static void show(MyClassArrayOfObjects[] objs){
        //Начальное значение текстовой переменной:
        String txt="| ";
        //В тексте дописываются значение полей объектов,
        //котррые формируют массив, переданный
        //аргументом методу
        for(int k=0;k<objs.length;k++){
            txt+=objs[k].get()+" | ";
        }
        //Отображение сообщения в окне вывода:
        System.out.println(txt);
    }
    //Главный метод программы:
    public static void main(String[] args) {
    //Создание массивов из объектов:
    MyClassArrayOfObjects[] A=createBinoms(5);
    MyClassArrayOfObjects[] B=createBinoms(10);
    //Отображение значений полей объектов из массивов:
        show(A);
        show(B);
    }
}
