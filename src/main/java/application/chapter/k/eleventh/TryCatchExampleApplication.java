package application.chapter.k.eleventh;
//Статический импорт:
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
//Главный класс:
class TryCatchExampleDemo {
    //Главный метод:
    public static void main(String[] args) {
        //Текстовая переменная для запсии
        //считываемого значения:
        String input;
        //Переменная для записи целого числа:
        int num;
        //Отображение диалогового окна с полем ввода:
        input=showInputDialog(null,
                "Введите число",//Текст над полем ввода
                "Число",//Название окна
                QUESTION_MESSAGE//Тип окна
        );
        //Блок контролируемого кода:
        try {
            //Поптыка перобразовать текст в число:
            num = parseInt(input);
            //Отображение диалогового окна с числами:
            showMessageDialog(null,
                    //Отображаемый в окне текст:
                    "Числа " + (num - 1) + ", " + num + " и " + (num + 1),
                    "Числа", //Название окна
                    INFORMATION_MESSAGE //Тип окна
            );
            //Обработка ошибок(код выполняется,
            //если в контрольном блоке возникла ошибка):
        }catch (Exception e){
            showMessageDialog(null,
                    "Что-то пошло не так...", //Сообщение в окне
                    "Ошибка", //Название окна
                    ERROR_MESSAGE //Тип окна
            );
        }
    }
}
