package practices.practice_19.task;

public class task_1 {

    public static void main(String[] args) {

        // 1. ArithmeticException
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: деление на ноль");
        }

        // 2. ArrayIndexOutOfBoundsException
        try {
            int[] arr = {1, 2, 3};
            int x = arr[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: выход за границы массива");
        }

        // 3. IllegalArgumentException
        try {
            setAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: некорректный аргумент");
        }

        // 4. ClassCastException
        try {
            Object obj = "Hello";
            Integer num = (Integer) obj;
        } catch (ClassCastException e) {
            System.out.println("ClassCastException: неверное приведение типов");
        }

        // 5. NullPointerException
        try {
            String s = null;
            s.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: обращение к null");
        }
    }

    static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }
    }
}
