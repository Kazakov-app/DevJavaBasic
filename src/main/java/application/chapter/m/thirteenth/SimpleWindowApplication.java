package application.chapter.m.thirteenth;
//Импорт класса JFrame:
import javax.swing.JFrame;
//Подкласс создан наследованием суперкласса JFrame:
class MyFrame extends JFrame{
    //Конструктор:
    MyFrame(String name){
        //Вызов конструктора суперкласса:
        super(name);
        //Положение окна и размеры:
        setBounds(850,350,300,200);
        //Окно постоянных размеров:
        setResizable(true);
        //Реакция на щелчок системной пиктограммы:
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Отображение окна на экране:
        setVisible(true);
    }
}
//Главный класс:
class SimpleWindowDemo {
    //Главный метод:
    public static void main(String[] args) {
        //Создание анонимного объекта подкласса:
        new MyFrame("Обычное окно");
    }

}
