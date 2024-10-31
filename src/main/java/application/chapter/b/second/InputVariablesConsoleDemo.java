package application.chapter.b.second;

//Импортирование класса Scanner
import java.util.Scanner;

class InputVariablesConsoleDemo {
    public static void main(String[] args){
        //создание объекта input класса Scanner:
        Scanner input=new Scanner(System.in);
        //Текущий год:
        int now=2024;
        //Переменная для записи имени пользователя:
        String name;
        //Переменная для записи возраста:
        int age;
        //Переменная для записи значения роста (в метрах):
        double height;
        //Переменная для записи массы:
        //(в килограммах):
        double mass;

        System.out.print("Ваше имя:");
        //Считывание имени (текст):
        name=input.nextLine();
        System.out.print("Ваш возраст:");
        //Считывание возраста (целое число):
        age=input.nextInt();
        System.out.print("Ваш рост (в метрах):");
        //Считывание роста в метрах:
        //(число в формате с плавающей точкой):
        height=input.nextDouble();
        System.out.print("Масса тела (в килограммах):");
        //Считывание массы в килограммах в метрах:
        //(число в формате с плавающей точкой):
        mass=input.nextDouble();

        //Вычисление индекса массы тела:
        double bmi=mass/height/height;

        //Отображение имени
        System.out.println("Здравствуйте, "+name+"!");
        //Вычисление и отображение года рождения:
        System.out.println("Вы родились в "+(now-age)+" году.");
        //Отображение значения индекса массы тела:
        System.out.printf("Ваш индекс массы тела: %5.2f\n",bmi);
    }
}
        /*Шкала:
        Индекс массы тела	Соответствие между массой человека и его ростом:
        16 и менее	Выраженный дефицит массы тела
        16-18,5	Недостаточная (дефицит) масса тела
        18,5-25	Норма
        25-30	Избыточная масса тела (предожирение)
        30-35	Ожирение первой степени
        35-40	Ожирение второй степени
        40 и более	Ожирение третьей степени (морбидное)
         */