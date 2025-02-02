package application.chapter.m.thirteenth;
//Импорт класса JFrame:
import javax.swing.JFrame;
//Главный класс:
class JustAWindowDemo {
    //Главный метод:
    public static void main(String[] args) {
        //Создание объекта окна:
        JFrame wnd=new JFrame("Обычное окно");
        //Размеры окна:
        wnd.setSize(300,200);
        //Положение окна на экране:
        wnd.setLocation(850,350);
        //Окно постоянных размеров:
        wnd.setResizable(false);
        //Реакция на щелчок системной пиктограммы:
        wnd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Отображение окна на экране:
        wnd.setVisible(true);
    }
}
