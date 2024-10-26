package application.chapter.a.first;

//Импортируется класс JOptionPane, через * весь подпакет swing
import javax.swing.*;

public class ShowMeNewWindowDemo {
    public static void main(String[] args) {
        //Текст для названия окна
        String title="Сообщение";
        //Текст сообщения
        String text="Продолжаем изучать Java";

        //Метод с отображением диалогового окна с сообщением с различными пиктограммами
        JOptionPane.showMessageDialog(null,text,title,JOptionPane.WARNING_MESSAGE );
        JOptionPane.showMessageDialog(null,text,title,JOptionPane.ERROR_MESSAGE );
        JOptionPane.showMessageDialog(null,text,title,JOptionPane.INFORMATION_MESSAGE );
        JOptionPane.showMessageDialog(null,text,title,JOptionPane.PLAIN_MESSAGE );
    }
}
