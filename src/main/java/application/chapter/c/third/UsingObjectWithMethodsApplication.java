package application.chapter.c.third;

import javax.swing.*;

//Описание класса:
 class MyNewClass {
    //Поля класса:
    int number;
    char symbol;

    //Метод для присваивания значений полям:
    void set(int n, char s) {
        number=n;
        symbol=s;
    }

    //Методом возвращается текстовая строка
    //с описанием объекта:
    String getInfo() {
        //Текст, который возвращается
        //результатом метода:
        String text = "Число: " + number + "\n";
        text+="Символ: "+symbol;
        //Результат метода:
        return text;
    }
}
//Описание класса с главным методом программы:
class UsingObjectWithMethodsDemo {
     //Главный метод программы:
    public static void main(String[]args){
        //Создание первого объекта:
        MyNewClass objA=new MyNewClass();
        //Создание второго объекта:
        MyNewClass objB=new MyNewClass();
        //Присваивание значений полям первого объекта:
        objA.set(100,'A');
        //Присваивание значений полям второго объекта:
        objB.set(200,'B');
        //Отображение первого диалогового окна:
        JOptionPane.showMessageDialog(null,
                objA.getInfo(),//отображаемый текст
                "Первый объект",//Заголовок окна
                JOptionPane.INFORMATION_MESSAGE);//Тип окна
        //Отображение второго диалогового окна:
        JOptionPane.showMessageDialog(null,
                objB.getInfo(),//отображаемый текст
                "Второй объект",//Заголовок окна
                JOptionPane.INFORMATION_MESSAGE);//Тип окна
    }
}
