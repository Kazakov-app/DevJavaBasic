package application.chapter.j.tenth;
//Функциональный интерфейс:
interface MyFunctionTwo{
    //Метод с аргументом типа double возыращает
    //результатом значение типа double:
    double f(double x);
}
//Главный класс:
class DerivativeCalcDemo {
    //Статический метод для вычисления производной:
    static MyFunctionTwo Derivative(MyFunctionTwo ref){
        //Приращение по аргументу для вычисления
        //производной в точке:
        double dx=1e-5;
        //Результат метда-лямбла-выражения:
        return (double x)->{return (ref.f(x+dx)- ref.f(x))/dx;};
    }
    //Главный метод:
    public static void main(String[] args) {
        //Производная для первой функции:
        MyFunctionTwo A=Derivative((double x)->{return x*(3-x);});
        //Производная для второй функции:
        MyFunctionTwo B=Derivative((double x)->{return x*Math.exp(-x);});
        //Проверка результатов вычисления:
        System.out.println("Производная для первой функции");
        System.out.println("Вычислено:\tТочно:");
        for (double t=0;t<=5;t++){
            System.out.printf("%8.5f\t%8.5f\n",A.f(t),(3-2*t));
        }
        System.out.println("Производная для второй функции");
        System.out.println("Вычислено:\tТочно:");
        for (double t=0;t<=5;t++){
            System.out.printf("%8.5f\t%8.5f\n",B.f(t),Math.exp(-t)*(1-t));
        }
    }
}
