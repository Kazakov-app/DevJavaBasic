package application.chapter.o.fifteenth;
//Импорт классов:
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
//Класс для создания объекта окна реализует
//интерфейс ListSelectionListener:
class MyFrameUsingList extends JFrame implements ListSelectionListener{
    //Список выбора:
    private JList LS;
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
    //состояния списка выбора:
    @Override
    public void valueChanged(ListSelectionEvent e) {
        //Метка присваивает новое изображение:
        L.setIcon(imgs[LS.getAnchorSelectionIndex()]);
    }
    //Конструктор:
    MyFrameUsingList(){
        //Настройка параметров окна:
        super("Список выбора:");
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
        //Создание списка выбора:
        LS=new JList(animals);
        //Положение и размеры списка:
        LS.setBounds(170,35,120,75);
        //Регистрация обработчика в списке:
        LS.addListSelectionListener(this);
        //Переход в режим выбора только
        //одного элемента списка:
        LS.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        //В списке выбирается начальный элемент:
        LS.setSelectedIndex(0);
        //Добавление списка в окно:
        add(LS);
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
class UsingListDemo {
    //Главный метод:
    public static void main(String[] args) {
        //Создание объекта окна:
        new MyFrameUsingList();
    }
}
