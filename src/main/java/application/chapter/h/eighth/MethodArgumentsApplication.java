package application.chapter.h.eighth;

class MethodArgumentsDemo {
    //Статический метод с двумя целочислительными аргументами,
    //которые "обмениваются" значениями:
    static void swap(int a, int b){
        System.out.println("Выполняется метод swap()");
        //Значения аргументов метода до
        //изменение значений:
        System.out.println("Аргументы до измнения значений: "+a+" и "+b);
        //Аргументы "обмениваются" значениями:
        int x=b;
        b=a;
        a=x;
        //Значения аргументов метода после
        //измнения значений:
        System.out.println("Аргументы после изменения значений: "+a+" и "+b);
        System.out.println("Завершено выполнение метода swap()");
    }
    //Главный метод программы
    public static void main(String[] args) {
        //Целочислительные переменные:
        int m=100,n=200;
        //Значения переменных до вызова метода swap():
        System.out.println("Переменные до вызова метода swap(): "+m+" и "+n);
        //Вызов метода swap():
        swap(m,n);
        //Значение переменных после вызова метода swap():
        System.out.println("Переменные после вызова метода swap(): "+m+" и "+n);
    }
}
