package application.chapter.m.thirteenth;
//Импорт классов:
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//Класс для создания окна:
class MyFrameNew extends JFrame{
    //Конструктор:

    MyFrameNew(String name) {
        //Вызов конструктора суперкласса:
        super(name);
        //положение и размеры окна:
        setBounds(850,350,300,200);
        //Окно постоянных размеров:
        setResizable(false);
        //Реакция на щелчок системной пиктограммы:
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Отключение менеджера компоновки:
        setLayout(null);
        //Создание объекта метки:
        JLabel lbl=new JLabel("Текст синего цвета",JLabel.CENTER);
        //Положение и размеры метки:
        lbl.setBounds(10,30,270,50);
        //Синий цвет для текста метки:
        lbl.setForeground(Color.BLUE);
        //Рамка вокруг метки:
        lbl.setBorder(BorderFactory.createEtchedBorder());
        //Добавление метки в окно:
        add(lbl);
        //Создание объекта кнопки:
        JButton btn=new JButton("Закрыть окно");
        //Положение и размеры кнопки:
        btn.setBounds(50,120,200,30);
        //Отменяется режим отображения рамки фокуса:
        btn.setFocusPainted(false);
        //Регистрация анонимного обработчика в кнопке:
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        //Добавление кнопки в окно:
        add(btn);
        //Отображение окна на экране:
        setVisible(true);
    }
}
//Главный класс:
class AnonymousHandlerDemo {
    //Главный метод:
    public static void main(String[] args) {
        //Создание объекта окна:
        new MyFrameNew("Анонимный обработчик");
    }
}
