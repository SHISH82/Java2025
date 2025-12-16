package practices.practice_18.task;

import java.util.Formatter;
import java.util.Date;

public class task_1 {

    public static void main(String[] args) {

        Formatter formatter = new Formatter();

        formatter.format("Логическое значение: %b%n" + // %b
                        "Символ: %c%n" + // %c
                        "Целое число: %d%n" + // %d
                        "Число с плавающей точкой: %f%n" + // %f
                        "Дата и время: %tT%n", // %t
                true,
                'A',
                123,
                45.67,
                new Date()
        );

        System.out.println(formatter.toString());
        formatter.close();
    }
}
