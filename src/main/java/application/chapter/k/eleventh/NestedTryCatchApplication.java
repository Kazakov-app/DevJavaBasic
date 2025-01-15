package application.chapter.k.eleventh;
//Импорт классов:
import java.util.*;
//Главный класс:
class NestedTryCatchDemo {
    public static void main(String[] args) {
        //Объект класса Scanner(нужен для реализаци
        //консольного ввода):
        Scanner input=new Scanner(System.in);
        //Переменная массива:
        char[]symbs;
        //Переменные для записи размера массива
        //и индекса элемента:
        int size,index;
        //Контролируемый код (внешний блок):
        try{
            //Отображение сообщения:
            System.out.print("Укажите размер массива: ");
            //Считывание размера массива:
            size=input.nextInt();
            //Создание массиваЖ
            symbs=new char[size];
            System.out.print("| ");
            //Заполнение массива символами:
            for (int k=0;k<size;k++){
                //Элементу массива присваивается значение:
                symbs[k]=(char)('A'+k);
                //Отображение значения элемента:
                System.out.print(symbs[k]+" | ");
            }
            //Контролируемый код (внутренний блок):
            try{
                System.out.print("\nУкажите индекс: ");
                //Считывание значение индекса:
                index=input.nextInt();
                //Значение элемента:
                System.out.println("Символ - " +symbs[index]);
            }
            //Если пользователь ввел некорректный индекс:
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Такого элемента нет");
            }
            //Блок выполняется всегда:
            finally {
                System.out.println("Массив создан успешно");
            }
            System.out.println("Для индекса указано числовое значение");
        }
        //Если введено не число:
        catch (InputMismatchException e){
            System.out.println("Ошибка: вы не ввели число");
        }
        //Если для массива указан отрицаетльный размер:
        catch (NegativeArraySizeException e){
            System.out.println("Неверный размер массива");
        }
        System.out.println("Выполнение программы завершено");
    }
}
