package application.chapter.k.eleventh;
//Класс контролируемого исключения создается
//наследованием класса Exception
class MyException extends Exception{
    //Закрытое числовое поле:
    private int code;
    //Конструктор:
    MyException(int n){
        super();
        code=n;
    }
    //Переопределени метода toString():
    public String toString(){
        String txt="Исключение класса MyException\n";
        txt+="Код ошибки: "+code+"\n";
        txt+="______________________";
        return txt;
    }
}
//Класс некотнтролируемого исключения создается
//наследованием класса RuntimeException:
class MyMistake extends RuntimeException{
    //Закрытое числовое поле:
    private int code;
    //Конструктор:
    MyMistake(int n){
        super();
        code=n;
    }
    //Переопределени метода toString():
    public String toString(){
        String txt="Исключение класса MyMistake\n";
        txt+="Код ошибки: "+code+"\n";
        txt+="______________________";
        return txt;
    }
}
//Главный класс:
class UsingMyExceptionDemo {
    //Статический метод выбрасывает контролируемое
    //исключение класса MyException:
    static void alpha(int n) throws MyException{
        throw new MyException(n);
    }
    //Статический метод выбрасывает неконтролируемое
    //исключение класса MyMistake:
    static void bravo(int n){
        throw new MyMistake(n);
    }
    //Главный метод:
    public static void main(String[] args) {
        //Контролируемый код(внешний блок):
        try {
            //Контролориемый код(внутренний блок):
            try {
                //метод выбрасывает исключением MyException:
                alpha(123);
            }
            //Обработка исключения класса MyException
            catch (MyException e) {
                System.out.println(e);
                bravo(321);
            }
        }
            catch (MyMistake e){
                System.out.println(e);
        }
    }
}
