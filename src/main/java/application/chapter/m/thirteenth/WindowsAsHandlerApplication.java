package application.chapter.m.thirteenth;
//Импорт классов:
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//Класс для создания окна:
class MyFrameImplements extends JFrame implements ActionListener{
    //Описание метода из интерфейса ActionListener:
    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
    //Конструктор:

    public MyFrameImplements(String title) {
        //Вызов конструктора суперкласса:
        super(title);
        //положение и размеры окна:
        setBounds(850,350,300,200);
        //Окно постоянных размеров:
        setResizable(false);
        //Реакция на щелчок системной пиктограммы:
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Отключение менеджера компоновки:
        setLayout(null);
        //Создание объекта панели:
        JPanel pnl=new JPanel();
        //Положение и размеры панели:
        pnl.setBounds(5,5,275,110);
        //Рамка вокруг панели:
        pnl.setBorder(BorderFactory.createEtchedBorder());
        //Отключения менеджера компоновки для панели:
        pnl.setLayout(null);
        //Объект изображения (для отображения в метке):
        ImageIcon img=new ImageIcon("src/main/resources/pictures/giraffe.jpeg");
        //Текстовое значение для отображения в метке:
        String txt="<html>Это жираф.<br>Он большой.<br>Он все видит.</html>";
        //Создание метки с изображением:
        JLabel imgLbl=new JLabel(img);
        //Положение и размеры метки:
        imgLbl.setBounds(10,10,90,90);
        //Рамка вокруг метки:
        imgLbl.setBorder(BorderFactory.createEtchedBorder());
        //Создание объекта для метки с текстом:
        JLabel txtLbl=new JLabel(txt,JLabel.CENTER);
        //Положение и размеры метки:
        txtLbl.setBounds(110,10,155,90);
        //Рамка вокруг метки:
        txtLbl.setBorder(BorderFactory.createEtchedBorder());
        //Создание объекта кнопки:
        JButton btn=new JButton("Закрыть окно");
        //Положение и размеры кнопки:
        btn.setBounds(50,120,200,30);
        //Отменяем режим отображения рамки фокуса:
        btn.setFocusPainted(false);
        //Регистрация в кнопке обработчиком
        //объекта окна:
        btn.addActionListener(this);
        //Создание объекта шрифта:
        Font F=new Font(
                //Название шрифта как у кнопки:
                btn.getFont().getName(),
                //Стиль - жирный курсив;
                Font.BOLD|Font.ITALIC,
                //Размер шрифта на 2 больше чем у кнопки:
                btn.getFont().getSize()+2);
        //Применение шрифта к метке с текстом:
        txtLbl.setFont(F);
        //Добавление меток на панель:
        pnl.add(imgLbl);
        pnl.add(txtLbl);
        //Добавление панели в окно:
        add(pnl);
        //Добавление кнопки в окно:
        add(btn);
        //Отображение окна на экране:
        setVisible(true);
    }
}
//Главный класс:
class WindowsAsHandlerDemo {
    //Главный метод:
    public static void main(String[] args) {
        //Создание объекта окна:
        new MyFrameImplements("Обработчик - объект окна");
    }
}
