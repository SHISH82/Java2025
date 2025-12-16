package practices.practice_22.task;

import java.io.FileInputStream;
import java.io.IOException;

public class task_4 {

    public static void main(String[] args) {

        //Автоматический вызов close (try-with-resources)
        try (FileInputStream input = new FileInputStream("test.txt")) {

            int data;
            while ((data = input.read()) != -1) {
                System.out.print((char) data);
            }

        } catch (IOException e) {
            System.out.println("Ошибка ввода");
        }
    }
}
