package application.chapter.o.fifteenth;
//Импорт классов:

import javax.swing.*;
import java.awt.event.*;

//Класс для создания объекта окна реализует
//интерфейс ItemListener:
class MyFrameUsingRadioButton extends JFrame implements ItemListener{
    //Массив переключателей:
    private JRadioButton[] R;
    //Кнопка:
    private JButton B;
    //Метка:
    private JLabel L;
    //Массив с названиями животных:
    private String[] animals=new String[]{"Лиса","Волк","Медведь","Енот"};
    //Массив с названиями файлов с изображениями:
    private String[] files=new String[]{"fox.jpg","wolf.png","bear.png","raccoon.jpg"};
    //Путь к каталогу с изображениями:
    private String path="src/main/resources/pictures/";
    //Массив с изображениями:
    private ImageIcon[]imgs;
    //Метод вызывается при изменении
    //состояния переключателя:

    @Override
    public void itemStateChanged(ItemEvent e) {
        //Путем перебора и проверки состояния переключателей
        //определяется изображение для метки:
        for (int k=0;k<R.length;k++){
            //Если переключатель установлен:
            if(R[k].isSelected()){
                //Новое изображение для метки:
                L.setIcon(imgs[k]);
                //Завершение операции цикла:
                break;
            }
        }
    }
    //Конструктор:
    MyFrameUsingRadioButton(){
        //Настройка параметров окна:
        super("Группа переключателей");
        setBounds(850,350,310,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        //Создание массива из ссылок на объекты изображения:
        imgs=new ImageIcon[files.length];
        //Создание объектов изображений
        //и заполнение массива:
        for (int k=0;k<imgs.length;k++) {
            imgs[k]=new ImageIcon(path+files[k]);
        }
        //Создание метки с изображением:
        L=new JLabel(imgs[0]);
        //Положение и размеры метки:
        L.setBounds(10,10,150,100);
        //Добавление метки в окно:
        add(L);
        //Создание и добавление в окно метки с текстом:
        JLabel lbl=new JLabel("Сделайте выбор:");
        lbl.setBounds(170,10,120,20);
        add(lbl);

        //Создание объекта для группы переключателей:
        ButtonGroup BG=new ButtonGroup();
        //Создание массива переключателей:
        R=new JRadioButton[animals.length];
        //Создание объектов переключателей и выполнение
        //настроек:
        for(int k=0;k<R.length;k++){
            //Создание объекта переключателя:
            R[k]=new JRadioButton(animals[k]);
            //Добавление переключателя в группу:
            BG.add(R[k]);
            //Положение и размеры переключателя:
            R[k].setBounds(170,31+21*k,120,20);
            //Регистрация в переключателе обработчика:
            R[k].addItemListener(this);
            //Добавление переключателя в окно:
            add(R[k]);
        }
        //Устанавливается первый переключатель:
        R[0].setSelected(true);

        //Создание кнопки:
        B=new JButton("ОК");
        //Положение и размеры кнопки:
        B.setBounds(90,120,120,30);
        //Регистрация обработчика в кнопке:
        B.addActionListener(e -> System.exit(0));
        //Добавление кнопки в окно:
        add(B);
        //Отображение окна на экране:
        setVisible(true);
    }
}
//Главный класс:
class UsingUsingRadioButtonDemo {
    //Главный метод:
    public static void main(String[] args) {
        //Создание объекта окна:
        new MyFrameUsingRadioButton();
    }
}
