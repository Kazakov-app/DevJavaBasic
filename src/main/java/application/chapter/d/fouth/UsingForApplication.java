package application.chapter.d.fouth;

//Класс с главным методом программы:
class UsingForDemo {
    //Главный метод программы:
    public static void main(String[] args) {
        //Целочислительные переменные:
       int s=0,k,n=25;
       //Вычисление суммы квадратов натуральных чисел:
        for(k=1;k<=n;k++){
            s+=k*k;
        }
        //Текст для отображения в окне вывода:
        String txt="Сумма квадратов чисел от 1 до "+n+": "+s;
        //Отображение результата вычислений:
        System.out.println(txt);
    }
}
class UsingForDemoTwo {
    //Главный метод программы:
    public static void main(String[] args) {
        //Целочислительные переменные:
        int s=0,n=10;
        //Вычисление суммы квадратов натуральных чисел:
        for(int k=1;k<=n;k++){
            s+=k*k;
        }
        //Текст для отображения в окне вывода:
        String txt="Сумма квадратов чисел от 1 до "+n+": "+s;
        //Отображение результата вычислений:
        System.out.println(txt);
    }
}
class UsingForDemoThree {
    //Главный метод программы:
    public static void main(String[] args) {
        //Целочислительные переменные:
        int s,k,n=9;
        //Вычисление суммы квадратов натуральных чисел:
        for(k=1,s=0;k<=n;s+=k*k,k++);

        //Текст для отображения в окне вывода:
        String txt="Сумма квадратов чисел от 1 до "+n+": "+s;
        //Отображение результата вычислений:
        System.out.println(txt);
    }
}

class UsingForDemoFour {
    //Главный метод программы:
    public static void main(String[] args) {
        //Целочислительные переменные:
        int s=0,k=1,n=10;
        //Вычисление суммы квадратов натуральных чисел:
        for(;k<=n;) {
            s+=k*k;
            k++;
        };

        //Текст для отображения в окне вывода:
        String txt="Сумма квадратов чисел от 1 до "+n+": "+s;
        //Отображение результата вычислений:
        System.out.println(txt);
    }
}
class UsingForDemoFive {
    //Главный метод программы:
    public static void main(String[] args) {
        //Целочислительные переменные:
        int s=0,k=1,n=9;
        //Вычисление суммы квадратов натуральных чисел:
        for(;;) {
            if(k>n) break;
            s+=k*k;
            k++;
        };

        //Текст для отображения в окне вывода:
        String txt="Сумма квадратов чисел от 1 до "+n+": "+s;
        //Отображение результата вычислений:
        System.out.println(txt);
    }
}
class UsingWhileDemoTheSame {
    //Главный метод программы:
    public static void main(String[] args) {
        //Целочислительные переменные:
        int s=0,k=1,n=8;
        //Вычисление суммы квадратов натуральных чисел:
        while(k<=n){
            s+=k*k;
            k++;
        };

        //Текст для отображения в окне вывода:
        String txt="Сумма квадратов чисел от 1 до "+n+": "+s;
        //Отображение результата вычислений:
        System.out.println(txt);
    }
}
class UsingDoWhileDemoTheSame {
    //Главный метод программы:
    public static void main(String[] args) {
        //Целочислительные переменные:
        int s=0,k=1,n=9;
        //Вычисление суммы квадратов натуральных чисел:
        do{
          s+=k*k;
          k++;
        }while(k<=n);


        //Текст для отображения в окне вывода:
        String txt="Сумма квадратов чисел от 1 до "+n+": "+s;
        //Отображение результата вычислений:
        System.out.println(txt);
    }
}






