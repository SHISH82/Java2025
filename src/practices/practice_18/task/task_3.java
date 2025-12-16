package practices.practice_18.task;

import java.util.Formatter;
import java.util.Calendar;

public class task_3 {

    public static void main(String[] args) {

        Formatter formatter = new Formatter();

        Calendar date = Calendar.getInstance();
        date.set(2025, Calendar.JANUARY, 1, 0, 0, 0);

        formatter.format("Час: %tH%n" + // %tH
                        "Минуты: %tM%n" + // %tM
                        "Секунды: %tS%n" + // %tS
                        "Год: %tY%n" + // %tY
                        "День недели: %tA%n", // %tA
                date, date, date, date, date
        );

        System.out.println(formatter.toString());
        formatter.close();
    }
}
