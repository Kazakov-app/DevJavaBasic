package application.chapter.m.thirteenth;
//Импорт классов:
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//Класс для создания окна:
class MyNewFrame extends JFrame{
    //Конструктор:
    MyNewFrame() {
        //Вызов конструктора суперкласса:
        super("Окно с кнопкой");
        //Положение и размеры окна:
        setBounds(850, 350, 300, 200);
        //окно постоянных размеров:
        setResizable(false);
        //Реакция на щелчок системы пиктограммы:
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Отключение менеджера компоновки:
        setLayout(null);
        //Создание объекта метки:
        JLabel lbl = new JLabel("Щелчок на кнопке приводит к закрытию окна");
        //Положение и размер метки:
        lbl.setBounds(10, 30, 280, 50);
        //Добавление метки в окно:
        add(lbl);
        //Создание объекта кнопки:
        JButton btn = new JButton("Закрыть окно");
        //Положение и размеры кнопки:
        btn.setBounds(50, 120, 200, 30);
        //Создание объекта для обработчика события
        //происходящего при щелчке кнопки:
        MyHandler hnd=new MyHandler();
        //Регистрация обработчика в кнопке:
        btn.addActionListener(hnd);
        //Добавление кнопки в окно:
        add(btn);
        //Отображение окна на экране:
        setVisible(true);
    }
}
//Класс обработчика:
class MyHandler implements ActionListener{
    //Определение метода из интерфейса:

    @Override
    public void actionPerformed(ActionEvent e) {
        //Завершение выхода программы:
        System.exit(0);
    }
}
//Главный класс:
class WindowWithButtonDemo {
    //Главный метод:
    public static void main(String[] args) {
        //Создание объекта окна:
        new MyNewFrame();
    }
}
