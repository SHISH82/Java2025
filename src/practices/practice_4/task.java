package practices.practice_4;
/**
 * Пример использования javadoc.
 */
public class task {

    /**
     * Возвращает сумму двух чисел.
     *
     * @param a
     * @param b
     * @return Sum a и b
     */
    public int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        task primer = new task();
        int result = primer.sum(5, 7);
        System.out.println("Сумма: " + result);
    }
}
