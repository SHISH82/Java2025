package practices.practice_20.task;

public class task_1 {

    public static void main(String[] args) {

        //Исключение перехватывается
        try {
            int a = 10 / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException перехвачено");
        }

        //Не перехватывается
        String s = null;
        s.length(); //Аварийное завершение программы
    }
}
