package application.chapter.f.sixth;

//Статический импорт:
import static javax.swing.JOptionPane.*;

//Главный класс:
class UsingPackageDemo {
    //Главный метод:
    public static void main(String[] args){
        //Отображение диалогового окна с сообщением:
        showMessageDialog(null,
                //Текст сообщения:
                "Статический импорт - это удобно!",
                //Название окна:
                "Пакет application",
                WARNING_MESSAGE
                );
    }
}
