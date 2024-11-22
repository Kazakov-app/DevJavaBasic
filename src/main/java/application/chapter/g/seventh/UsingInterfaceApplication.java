package application.chapter.g.seventh;
//Интрефейс:
interface MyInterface{
    //Статическая константа:
    int NUMBER=100;
    //Объявление методов:
    int getNumber(double x);
    char getSymbol(int n);
}
//Класс реализует интерфейс:
class MyClass implements MyInterface{
    //Описание методов:


    @Override
    public int getNumber(double x) {
        return (int) x;
    }
    @Override
    public char getSymbol(int n) {
        return (char)('A'+n);
    }
}
//Главный класс:
class UsingInterfaceDemo{
    public static void main(String[] args) {
        MyClass obj=new MyClass();
        System.out.println("Статическая константа: "+MyClass.NUMBER);
        System.out.println("Целое число: "+obj.getNumber(12.5));
        System.out.println("Символ: "+obj.getSymbol(3));
    }
}

