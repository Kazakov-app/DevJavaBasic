package org.example.application.chapter.second;

import javax.swing.*;

public class InputDoubleVariablesApplication {
    public static void main(String[] args){
        //Числовые переменные:
        double mass,height,bmi;
        //Переменная для записи значения в поле ввода:
        String result;
        //Считывание значения из поля ввода:
        result=JOptionPane.showInputDialog("Ваш рост в метрах?");
        //Преобразование текста в число:
        height=Double.parseDouble(result);
        //Считывание значения из поля ввода:
        result=JOptionPane.showInputDialog("Ваш вес в киллограмах?");
        //Преобразование текста в целое число:
        mass=Double.parseDouble(result);
        //Вычисление индекса массы тела:
        bmi=mass/height/height;
        //Округление полученного значения:
        bmi=Math.round(bmi*100)/100.0;
        //Отображение окна с сообщением:
        JOptionPane.showMessageDialog(null,"Индекс массы тела: "+bmi);
    }
}
        /*Шкала:
        Индекс массы тела	Соответствие между массой человека и его ростом:
        16 и менее	Выраженный дефицит массы тела
        16-18,5	Недостаточная (дефицит) масса тела
        18,5-25	Норма
        25-30	Избыточная масса тела (предожирение)
        30-35	Ожирение первой степени
        35-40	Ожирение второй степени
        40 и более	Ожирение третьей степени (морбидное)
         */