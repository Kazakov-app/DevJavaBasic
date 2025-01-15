package application.chapter.my.examples;

import java.util.Scanner;

class StringFormatDemo {
     public static void main(String[] args) {
         float usdToRub = 113.78f;
         float eurToRub = 125.31f;

         int amount = 75;

         float eurToUsd = eurToRub / usdToRub;
         float result = amount * eurToUsd;

         String format = "Курс Евро к Доллару: %.2f.\n%d Евро это %.2f Долларов.";  //

         System.out.println(String.format(format, eurToUsd, amount, result));


//Импровизированная линия
        for(int k=1;k<=20;k++){
            String txt="_";
            System.out.print(txt);
        }
    }
}

class CallMethodsDemo {
    public static void main(String[] args) {
        System.out.println("Робот-помощник v2.0.");
        // Вызовите ниже методы в правильном порядке (как указано в условиях задачи)
        sayHello();
        goodDay();
        welcomeUserByName();
        printSuccess();

    }

    public static void welcomeUserByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Как вас зовут?");
        String name = scanner.next();
        printCity();
        String city = scanner.next();

        // Спросите пользователя, из какого он города, используя метод printCity()
        // Создайте и проинициализируйте строковую переменную String city при помощи объекта scanner аналогично тому, как проинициализирована переменная name выше

        System.out.println("Рад познакомиться, " + name + " из " + city + "!");
    }

    public static void printSuccess() {
        System.out.println("У вас уже неплохо получается программировать!");
    }

    // Напишите метод sayHello(), который печатает: "Привет!"
    public static void sayHello() {
        System.out.println("Привет!");
    }

    // Напишите метод goodDay(), который выводит строку: "Хорошего дня!"
    public static void goodDay() {
        System.out.println("Хорошего дня!");
    }
    // Напишите метод printCity(), который спрашивает: "Из какого вы города?"
    public static void printCity(){
        System.out.println("Из какого вы города?");
    }
}
class MaxNumberDemo {

    public static void main(String[] args) {
        System.out.println("Наибольшее из чисел 3 и 5 = " + findMax(3,5));
        // Напишите аналогичный вызов метода findMax для таких пар чисел: 16 и 5, -1 и -7
        System.out.println("Наибольшее из чисел 16 и 5 = " + findMax(16,5));
        System.out.println("Наибольшее из чисел -1 и -7 = " + findMax(-1,-7));

    }

    public static int findMax(int a,int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

}
