package application.chapter.a.first;

//Импортируется класс JOptionPane, через * весь подпакет swing
import javax.swing.*;

public class ShowMeAWindowDemo {
    public static void main(String[] args) {
        //Метод с отображением диалогового окна с текстом
        JOptionPane.showMessageDialog(null,"Моя первая программа на Java" );
    }
}
