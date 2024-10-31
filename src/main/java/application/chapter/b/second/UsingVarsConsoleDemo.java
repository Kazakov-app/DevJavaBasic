package application.chapter.b.second;

public class UsingVarsConsoleDemo {
    public static void main(String[] args){
        //Целочислительная переменная:
        int number=123;
        //Действительная переменная:
        double x=32.1;
        //Символьная переменная:
        char symbol='A';
        //Логическая переменная:
        boolean state=false;
        //Отображение текста:
        System.out.println("Используемые переменные: ");
        //Отображение значения целочислительной переменной:
        System.out.println("Целое число: "+number);
        //Отображение значения числовой переменной:
        System.out.println("Действительное число: "+x);
        //Отображение значения символьной переменной:
        System.out.println("Символ: "+symbol);
        //Отображение значения логической переменной:
        System.out.println("Логическое значение: "+state);
    }
}