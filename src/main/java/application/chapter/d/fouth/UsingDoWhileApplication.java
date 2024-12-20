package application.chapter.d.fouth;

import javax.swing.*;

//Класс с главным методом программы:
class UsingDoWhileDemo {
    //Статический метод для определения бинарного
    //кода (результат метода) числа (аргумент метода):
    static String coder(int number) {
        //Текстовая переменная для записи результата:
        String s="";
        //Число для вычисления бинарного кода:
        int n=number;
        do {
            //Добавление к текстовой строке s слева
            //очередного параметра в бинарном представлении
            s = (n % 2) + s;
            //Значение переменной уменьшается в два раза:
            n /= 2;
        }while (n!=0);
        return s;
        }

    //Главный метод программы:
    public static void main(String[] args) {
        //Текстовая переменная для записи значения
        //из поля ввода в диалоговом окне:
        String input;
        //Название для диалоговых окон:
        String title = "Вычисление бинарного кода";
        //Отображение диалогового окна для ввода числа:
        input=JOptionPane.showInputDialog(null,
                "Введите целое число",//Надпись над полем ввода
                title,//Название окна
                JOptionPane.QUESTION_MESSAGE //Тип пиктограммы
        );
        //Если пользователь не ввел число:
        if (input==null){
            //Завершение выполенния программы:
            System.exit(0);
        }
        //Определение числа на основе текста:
        int num=Integer.parseInt(input);
        //Определение бинарного кода:
        String code=coder(num);

        //Текст для отображения в диалоговорм окне:
        String text="Вы ввели число: "+num;
        text+="\nБинарный код числа: "+code;
        //Отображение диалогового окна:
        JOptionPane.showMessageDialog(null,
                text, //Текст сообщения
                title, //Название окна
                JOptionPane.INFORMATION_MESSAGE //Тип пиктограммы
                 );
    }
}






