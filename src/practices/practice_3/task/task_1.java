package practices.practice_3.task;

public class task_1 {

    public static void main(String[] args) {

        byte byteValue = 5;
        byte byteZero = 0;

        short shortValue = 100;
        short shortZero = 0;

        int intValue = 1000;
        int intZero = 0;

        long longValue = 100000L;
        long longZero = 0L;

        float floatValue = 1.5f;
        float floatZero = 0.0f;

        double doubleValue = 2.75;
        double doubleZero = 0.0;

        char charValue = 'A';
        char charZero = '\u0000';

        boolean booleanValue = true;
        boolean booleanZero = false;

        System.out.println("byte: " + byteValue + ", zero: " + byteZero);
        System.out.println("short: " + shortValue + ", zero: " + shortZero);
        System.out.println("int: " + intValue + ", zero: " + intZero);
        System.out.println("long: " + longValue + ", zero: " + longZero);

        System.out.println("float: " + floatValue + ", zero: " + floatZero);
        System.out.println("double: " + doubleValue + ", zero: " + doubleZero);

        System.out.println("char: " + charValue + ", zero: '" + charZero + "'");
        System.out.println("boolean: " + booleanValue + ", zero: " + booleanZero);
    }
}
