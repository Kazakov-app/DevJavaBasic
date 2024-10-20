package org.example.application.chapter.fifth;
import javax.swing.*;
class UsingListDemo {
    public static void main(String[] args){
        //текстовый массив с навзаниями животных:
        String[] txt={"Волк","Лиса","Медведь","Енот"};
        //Текстовый массив с названиями животных
        //с изображением животных:
        String[] files={"wolf.png","fox.jpg","bear.png","raccoon.jpg"};
        //Текстовая переменная определяющая путь
        //к файлам с изображениями животных:
        String folder="src\\main\\resources\\pictures\\";
        //Текст для отображения в диалоговом окне:
        String msg="Кого показать?";
        //Текст с названием диалогового окна:
        String title="В мире животных";
        //Объект для пиктограммы, отображаемой
        //в диалогомо окне:
        ImageIcon img=new ImageIcon(folder+"giraffe.jpeg");
        //Тестовая переменная для запсии выбранного
        //пользователем животного:
        String animal;
        //Отображения диалогового окна
        //с раскрывающимся списком для выбранного животного:
        animal=(String)JOptionPane.showInputDialog(null,
                msg, //Текст над раскрывающимся списком
                title, //Название окна
                JOptionPane.PLAIN_MESSAGE, //Тип окна
                img, //Пиктограммаб отображаемая в окне
                txt, //Элемент раскрывающегося списка
                txt[0]// Выбранный по умолчанию элемент
                );
        //Если пользователь отменил ввод
        if(animal==null){
            //Завершение выполнения программы:
            System.exit(0);
        }
        //Опредедение пиктограммы для отображения
        //в диалогомо окне:
        for (int k=0;k< txt.length;k++){
            //Если текст в переменной animal совпадает
            //с текстовым значением элемента в массиве:
            if(animal.equals(txt[k])){
                //Создание объекта пиктограммы
                img=new ImageIcon(folder+files[k]);
                //Завершение оператора цикла:
                break;
            }
        }
        //Отображение диалогового окна с пиктограммой:
        JOptionPane.showMessageDialog(null,
                img, //Отображение изображения
                animal, //Название окна
                JOptionPane.PLAIN_MESSAGE //Тип окна
        );
    }
}
