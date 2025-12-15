package practices.practice_5.task;

public class task_1 {

    public static void main(String[] args) {

        // =, +=, -=, *=, /=, %=
        int a = 10;
        int b = 3;

        a += b;
        a -= b;
        a *= b;
        a /= b;
        a %= b;

        // + и - и * и / и %
        int sum = a + b;
        int diff = a - b;
        int mul = a * b;
        int div = a / b;
        int mod = a % b;

        // > >= < <= == !=
        boolean greater = a > b;
        boolean lessOrEqual = a <= b;
        boolean equal = a == b;
        boolean notEqual = a != b;

        // && и ||
        boolean logicAnd = (a > 0) && (b > 0);
        boolean logicOr = (a < 0) || (b > 0);

        // | ^ &
        int bitOr = a | b;
        int bitXor = a ^ b;
        int bitAnd = a & b;

        // << >> >>>
        int shiftLeft = a << 1;
        int shiftRight = a >> 1;
        int unsignedShift = a >>> 1;

        // ++ --
        int x = 5;
        int preInc = ++x;
        int postInc = x++;

        int y = 7;
        int preDec = --y;
        int postDec = y--;

        // ! ~
        boolean flag = false;
        boolean notFlag = !flag;
        int inverted = ~a;

        // ?:
        String result = a > b ? "a больше b" : "a меньше или равно b";

        // String + базовые типы
        String text = "Результат: " + a + ", " + b;

        // Вывод
        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + diff);
        System.out.println("Произведение: " + mul);
        System.out.println("Деление: " + div);
        System.out.println("Остаток: " + mod);
        System.out.println("Сравнения: " + greater + ", " + lessOrEqual);
        System.out.println("Логика: " + logicAnd + ", " + logicOr);
        System.out.println("Побитовые: " + bitOr + ", " + bitXor + ", " + bitAnd);
        System.out.println("Сдвиги: " + shiftLeft + ", " + shiftRight + ", " + unsignedShift);
        System.out.println("Префиксы: " + preInc + ", " + postInc);
        System.out.println("Постфиксы: " + preDec + ", " + postDec);
        System.out.println("Логика ! и ~: " + notFlag + ", " + inverted);
        System.out.println(result);
        System.out.println(text);
    }
}
