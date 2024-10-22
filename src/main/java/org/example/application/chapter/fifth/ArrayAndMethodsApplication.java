package org.example.application.chapter.fifth;

class ArrayAndMethodsDemo {
    //Метод для отображения содержимого
    //одномерного целочислительного массива:
    static void show1D(int[] nums){
        //Оператор цикла по коллекции:
        for(int s: nums){
            //Форматированный вывод числового значения:
            System.out.printf("%4d",s);
        }
        //Переход к новой строке:
        System.out.println("");
    }
    //Метод для отображения содержимого двумерного
    //целочисленного массива:
    static void show2D(int[][] nums){
        //Внешний оператор цикла по коллекции:
        for(int[] p:nums){
            //Внутренний оператор цикла по коллекции:
            for(int s:p){
                //Форматированный вывод числового значения:
                System.out.printf("%4d",s);
            }
            //Переход к новой строке:
            System.out.println("");
        }
    }
    //Метод для вычисления произведения матрийы и вектора.
    //Аргументами методу передаются двумерный
    //и одномеррный массивы. Результатом возвращается
    //одномерный массив:
    static int[] prod(int[][] A,int[]B){
        //Создание одномерного массива:
        int[] C=new int[A.length];
        //Вычисление значений элементов массива - результата
        //произведение матрицы и вектора:
        for(int i=0;i< C.length;i++){
            //Начальное нулевое значение элемента:
            C[i]=0;
            for(int j=0;j< B.length;j++){
                //Добавление очередного слагаемого:
                C[i]+=A[i][j]*B[j];
            }
        }
        //Результатом метода:
        return C;
    }
    //Главный метод программы:
    public static void main(String[] args){
        //Двумерный массив(матрица):
        int[][] A={{1,0,3,-1},{2,-1,-2,3},{-1,1,0,2}};
        //Одномерный массив(вектор):
        int[] B={1,-1,3,2};
        //Результат произведения матрицы на вектор:
        int[] C=prod(A,B);
        //Отображение содержимого матрицы:
        System.out.println("Матрица А:");
        show2D(A);
        //Отображение содержимого вектора:
        System.out.println("Вектор В:");
        show1D(B);
        //Отображение результата произведения
        //матрицы на вектор:
        System.out.println("Вектор С=АВ:");
        show1D(C);
    }
}
