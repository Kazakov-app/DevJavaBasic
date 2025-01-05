package application.chapter.j.tenth;
//Интерфейс: UsingLambdaApplication.MyNums
//Главный класс
class UsingAnonymousClassDemo {
    public static void main(String[] args) {
        //Присваиваем интерфейсной переменной ссылки
        //на объект анонимного класса:
        MyNums A=new MyNums() {
            //Описание метода из интерфейса:
            @Override
            public int get(int n) {
                int k,s=0;
                for(k=1;k<=n;k++){
                    s+=k;
                }
                return s;
            }
        };
        System.out.println("Используем анонимный класс:");
        A.show(10);
        System.out.println("Проверка: "+A.get(10));
        MyNums B=A;
        System.out.println("Новый анонимный класс:");
        //Переменной значением присваивается ссылка
        //на объект анонимного класса:
        A=new MyNums() {
            //Описание метода из интерфейса:
            @Override
            public int get(int n) {
                return n*n;
            }
        };
        System.out.println("Вызов метода show() из А:");
        A.show(10);
        System.out.println("Вызов метода show() из В:");
        B.show(10);
    }
}
