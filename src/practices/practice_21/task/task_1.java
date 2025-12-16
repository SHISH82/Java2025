package practices.practice_21.task;

// Иерархия исключений
class Ex1 extends Exception {}
class Ex2 extends Ex1 {}
class Ex3 extends Ex2 {}

public class task_1 {

    public static void main(String[] args) {

        //Обработка нескольких исключений
        try {
            int[] arr = new int[3];
            int x = arr[5];
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка выполнения операции");
        }

        //Иерархия исключений Ex1 <|-- Ex2 <|-- Ex3
        try {
            throw new Ex3();
        } catch (Ex3 e) {
            System.out.println("Обработан Ex3");
        } catch (Ex2 e) {
            System.out.println("Обработан Ex2");
        } catch (Ex1 e) {
            System.out.println("Обработан Ex1");
        }
    }
}

