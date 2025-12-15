package practices.practice_8.task;

public class task_1 {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // public
        int sum = calculator.add(5, 3);
        System.out.println("Сумма: " + sum);

        //protected
        int difference = calculator.subtract(10, 4);
        System.out.println("Разность: " + difference);

        // default
        int product = calculator.multiply(6, 7);
        System.out.println("Произведение: " + product);

         //calculator.divide(10, 2); //private метод недоступен
    }
}

class Calculator {

    // public доступен из любого класса
    public int add(int a, int b) {
        return a + b;
    }

    // protected доступен в том же пакете и в наследниках
    protected int subtract(int a, int b) {
        return a - b;
    }

    // без спецификатора доступен только в пределах пакета
    int multiply(int a, int b) {
        return a * b;
    }

    // private используется только внутри этого класса
    private int divide(int a, int b) {
        return a / b;
    }
}
