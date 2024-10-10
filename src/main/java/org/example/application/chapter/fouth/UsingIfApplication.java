package org.example.application.chapter.fouth;

import javax.swing.*;

class UsingIfDemo {
    public static void main(String[] args) {
        //Текстовые переменные:
        String input, txt, title;
        //Целочислительная переменная :
        int number;
        //Объектная переменная для записи ссылки
        //на объект пиктограммы:
        ImageIcon img;

        //Отображение окна с полем ввода:
        input = JOptionPane.showInputDialog(null,
                "Введите целое число", //Надпись над полем ввода
                "Проверка числа",              //Заголовок окна
                JOptionPane.QUESTION_MESSAGE  //Тип пиктограммы
        );
        //Проверка, выполнен ли ввод:
        if (input == null) { //Если ввод не выполнен
            //Отображение диалогового окна:
            JOptionPane.showMessageDialog(null,
                    "Вы не ввели число!", //Сообщение
                    "Ошибка ввода",               //Заголовок окна
                    JOptionPane.ERROR_MESSAGE     //Тип окна
            );
            //Завершение программы:
            System.exit(0);
        }
        //Преобразование текста в число:
        number = Integer.parseInt(input);
        //Проверка числа на четность/нечетность:
        if (number % 2 == 0) {//Если число четное
            //Создание объекта пиктограммы:
            img = new ImageIcon("C:\\Yaprakticum\\projects\\DevJava\\pictures\\bitcoin.png");
            //текст сообщения:
            txt = "Число " + number + "- четное!";
            //заголовок окна:
            title = "Четное число";
        } else {//Если число нечетное
            //Создание объекта пиктограммы:
            img = new ImageIcon("C:\\Yaprakticum\\projects\\DevJava\\pictures\\bitcoin.png");
            //текст сообщения:
            txt = "Число " + number + "- нечетное!";
            //заголовок окна:
            title = "Нечетное число";
            }
        //Отображение диалогового окна:
        JOptionPane.showMessageDialog(null,
                txt,//Текст сообщения
                title,//Заголовок окна
                JOptionPane.PLAIN_MESSAGE,//Тип сообщения
                img//Пиктограмма
                );
    }
}