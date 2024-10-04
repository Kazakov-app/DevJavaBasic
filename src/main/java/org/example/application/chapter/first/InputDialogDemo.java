package org.example.application.chapter.first;

//Импортируется класс JOptionPane, через * весь подпакет swing
import javax.swing.*;

public class InputDialogDemo {
    public static void main(String[] args) {
        //Текст для названия окна
        String title= "Информация";
        String titleInput= "Окно ввода текста сообщения";
        //Переменная для записи текста
        String text;

        //Отображение диалогового окна с полем ввода:
        text=JOptionPane.showInputDialog(null,"Ввведите в поле текст",titleInput,JOptionPane.QUESTION_MESSAGE);
        //Отображение диалогового окна с сообщением:
        JOptionPane.showMessageDialog(null,"В поле введен текст:\n" + text,title,JOptionPane.INFORMATION_MESSAGE);
    }
}
