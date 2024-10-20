package org.example.application.chapter.fouth;

import javax.swing.*;

class UsingIfMultiIfDemo {
    public static void main(String[] args) {
        //Объектная переменная для записи ссылки
        //на объект пиктограммы:
        ImageIcon img;
        //Текстовые переменные для записи
        //названия животного:
        String animal;
        //Текстовая переменная с начальным значением,
        //определяющим путь к файлу с изображением:
        String file="src\\main\\resources\\pictures\\";
        //Текстовые переменные с названием животных:
        String wolf="Волк";
        String fox="Лиса";
        String bear="Медведь";
        String raccoon="Енот";
        //Считываем названия животного:
        animal=JOptionPane.showInputDialog(null,
                //Текст над полем ввода:
                wolf+", "+fox+" или "+bear+"?",
                //Название окна:
                "Укажите название животного",
                JOptionPane.QUESTION_MESSAGE
                );
        //Вложенные условные операторы:
        if (animal==null){//Если пользователь отменил ввод
            System.exit(0);//Завершение выполнения программы
            }
        //Если животное "Волк":
        else if (animal.equalsIgnoreCase(wolf)){
            file+="wolf.png";
            animal=wolf;
        }
        //Если животное "Лиса":
        else if (animal.equalsIgnoreCase(fox)){
            file+="fox.jpg";
            animal=fox;
        }
        //Если животное "Медведь":
        else if (animal.equalsIgnoreCase(bear)){
            file+="bear.png";
            animal=bear;
        }
        //Неизвестное животное
        else {
            file+="raccoon.jpg";
            animal=raccoon;
        }

        //Создание объекта для пиктограммы:
        img=new ImageIcon(file);
        //Отображение диалогового окна:
        JOptionPane.showMessageDialog(null,
                img,//В окне отображается изображение
                animal,//Название окна
                //Тип диалогового окна:
                JOptionPane.PLAIN_MESSAGE
                );
    }
}