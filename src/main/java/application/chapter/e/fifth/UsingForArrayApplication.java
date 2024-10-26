package application.chapter.e.fifth;
import javax.swing.*;
import java.util.Random;
//Класс с главным методом программы:
class UsingForArrayApplication {
    //Главный метод программы:
    public static void main(String[] args){
        //Размер массива
        int size=10;
        //Объект для генерирования случайных чисел:
        Random rnd=new Random();
        //Создание массива:
        int[]nums=new int[size];
        //Текст для отображения в диалоговом окне:
        String txt="Массив случайных чисел:\n| ";
        //Заполнение массива случайными числами:
        for(int k=0;k< nums.length;k++){
            //Присваивание значением элементу
            //случайного числа:
            nums[k]=rnd.nextInt(10)+1;
            //Добавление к тексту значения элемента:
            txt+=nums[k]+" | ";
        }
        //Дополнение текстового значения:
        txt+="\nПроверка:\n| ";
        //Отображение элементов с помощью
        //оператора цикла по коллекции:
        for(int s: nums){
            //Добавление в текст значения элемента:
            txt+=s+" | ";
        }
        //Отображение диалогового окна:
        JOptionPane.showMessageDialog(null,
                txt, //Текст сообщения в окне
                "Случайные числа", //Название окна
                JOptionPane.PLAIN_MESSAGE //Тип окна
        );
    }
}
class AssigningArraysDemo{
    //Статический метод для отображения
    //содержимого массива (аргумент метода):
    static void show(int[] nums){
        //Оператор цикла по коллекции:
        for(int s: nums){
            //Отображение значения элемента массива:
            System.out.print("| "+s+" ");
        }
        System.out.println("|");
    }
    //Главный метод программы
    public static void main(String[] args){
        //Первый массив:
        int[] odd={1,3,5,7,9};
        //Второй массив:
        int[] even={2,4,8,10,12,14,16};
        System.out.println("Массив odd:");
        //Отображение содержимого первого массива:
        show(odd);
        System.out.println("Массив even:");
        //Отображение содержимого второго массива:
        show(even);
        System.out.println("Выполняется присваивание.");
        //Присваивание массивов:
        even=odd;
        //Изменением значения элемента массива:
        even[0]=-1;
        System.out.println("Массив odd:");
        //Отображение содержимого первого массива:
        show(odd);
        System.out.println("Массив even:");
        //Отображение содержимого второго массива:
        show(even);
    }
}
