package application.chapter.k.eleventh;

class UsingThrowDemo {
    public static void main(String[] args) {
        //Создание объекта исключения:
        Exception me=new Exception("Искусственная ошибка");
        //Контролируемый код(внешний блок):
        try{
            System.out.println("Генерируется ошибка");
            //Контролируемый код(внутренний блок):
            try{
                //Генерирование исключения:
                throw me;
            }
            //Обработка исключения(внутренний блок):
            catch (Exception one){
                System.out.println(one);
                System.out.println("А теперь еще одна ошибка");
                //Повторное генерирование исключения:
                throw one;
            }
        }
        //обработка исключения(внеший блок):
        catch (Exception two){
            System.out.println(two);
        }
        System.out.println("Выполнение программы завершено");
    }
}
