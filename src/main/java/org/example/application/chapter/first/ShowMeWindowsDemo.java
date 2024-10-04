package org.example.application.chapter.first;

//Импортируется класс JOptionPane, через * весь подпакет swing
import javax.swing.*;

public class ShowMeWindowsDemo {
    public static void main(String[] args) {
        //Переменная названия диалогового окна
        String title;
        //Переменная текста сообщения
        String text;

        //Отображение первого окна с полем ввода:
        title=JOptionPane.showInputDialog(null,"Имя для окна","Название",JOptionPane.WARNING_MESSAGE);
        //Отображение второго окна с полем ввода:
        text=JOptionPane.showInputDialog(null,"Текст сообщения","Содержание",JOptionPane.PLAIN_MESSAGE);
        //Отображение диалогового окна с сообщением:
        JOptionPane.showMessageDialog(null,text,title,JOptionPane.INFORMATION_MESSAGE);
    }
}
