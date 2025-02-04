package application.chapter.n.foutteenth;
//Импорт классов:
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
//Класс для создания окна реализуют интерфейсы
//ActionListener, MouseListener И KeyListener:

class MyFrameHandlingTextField extends JFrame implements ActionListener,MouseListener,KeyListener{
    //Метка:
    private JLabel L;
    //Текстовое поле:
    private JTextField T;
    //Кнопка:
    private JButton B;
    //Тип шрифта для кнопки:
    private String name="Arial";
    //Размер шрифта для кнопки:
    private int size=15;
    //Название кнопки:
    private String exit="Закрыть";

    //Метод для обработки щелчка на кнопке:
    @Override
    public void actionPerformed(ActionEvent e) {
        //Завершение выполнения программы:
        System.exit(0);
    }
    //Метод выполняется, когда курсор мыши покидает
    //область компонента:

    @Override
    public void mouseExited(MouseEvent e) {
        //Если событие произошло на метке:
        if(e.getSource()==L){
            //Применение эффекта "вдавливания" к метке:
            L.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
            //Применение выравнивания по левому краю
            //для текста в метке:
            L.setHorizontalAlignment(JLabel.LEFT);
        }//Если событие произошло на кнопке:
        else {
            //Текст обычный на кнопке:
            B.setText(exit);
            //Синий цвет для текста кнопки:
            B.setForeground(Color.BLUE);
            //Шрифт (обычный) для кнопки:
            B.setFont(new Font(name,Font.PLAIN,size));
        }
    }
    //Метод вызывается, когда курсор оказывается над
    //областью компонента:
    @Override
    public void mouseEntered(MouseEvent e) {
        //Если событие произошло на метке:
        if(e.getSource()==L){
            //Для метки применяется эффект "поднятия":
            L.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            //Применение выравнивания по правому краю
            //для текста в метке:
            L.setHorizontalAlignment(JLabel.RIGHT);
        }//Если событие произошло на кнопке:
        else{
            //Текст(подчеркнутый) для кнопки:
            B.setText("<html><u>"+exit+"</u></html>");
            //Красный цвет для текста кнопки:
            B.setForeground(Color.RED);
            //Шрифт(жирный) для текста кнопки:
            B.setFont(new Font(name,Font.BOLD,size+2));
        }
    }
    //Методы из интерфейса MouseListener
    //с пустой реализацией:
    @Override
    public void mouseReleased(MouseEvent e) {    }
    @Override
    public void mousePressed(MouseEvent e) {    }
    @Override
    public void mouseClicked(MouseEvent e) {    }
    //Метод вызывается при отпускании клавиши
    //на клавиатуре:
    @Override
    public void keyReleased(KeyEvent e) {
        //К метке применяется текст из текстового поля:
        L.setText(T.getText());
    }
    //Методы из интерфейса KeyListener
    //с пустой реализацией:
    @Override
    public void keyPressed(KeyEvent e) {    }
    @Override
    public void keyTyped(KeyEvent e) {    }
    //Конструктор:
    MyFrameHandlingTextField(){
        //Вызов конструктора суперкласса:
        super("Окно с текстовым полем");
        //Положение и размеры окна:
        setBounds(850,350,300,160);
        //Реакция на щелчок системы пиктограммы:
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Окно постоянных размеров:
        setResizable(false);
        //Отключение менеджера компоновки:
        setLayout(null);
        //Создание метки:
        L=new JLabel();
        //Положение и размеры метки:
        L.setBounds(10,10,275,30);
        //Выделение метки с помощью эффекта "вдавливания":
        L.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        //Регистрация в метке обработчика для
        //события класса MouseEvent:
        L.addMouseListener(this);
        //Создание текстового поля:
        T=new JTextField();
        //Положение и размеры поля:
        T.setBounds(10,50,275,30);
        //Регистрация в поле обработчика для
        //события класса KeyEvent
        T.addKeyListener(this);
        //Создание кнопки:
        B=new JButton(exit);
        //Положение и размеры кнопки:
        B.setBounds(60,90,175,30);
        //Отмена режима отображения фокуса
        //для кнопки:
        B.setFocusPainted(false);
        //Шрифт для текста кнопки:
        B.setFont(new Font(name,Font.PLAIN,size));
        //Синий цвет для текста кнопки:
        B.setForeground(Color.BLUE);
        //Регистрация объекта окна
        //Обработчиком события для кнопки:
        B.addActionListener(this);
        B.addMouseListener(this);
        //Добавление в окно метки:
        add(L);
        //Добавление поля в окно:
        add(T);
        //Добавление кнопки в окно:
        add(B);
        //Отображение окна:
        setVisible(true);
    }
}

//Класс для создания окна:
//Главный класс:
class HandlingTextFieldDemo {
    //Главный метод:
    public static void main(String[] args) {
        //Создание окна:
        new MyFrameHandlingTextField();
    }
}
