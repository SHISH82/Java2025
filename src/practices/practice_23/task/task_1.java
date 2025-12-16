package practices.practice_23.task;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class task_1 {

    public static void main(String[] args) {

        try {
            //Scanner для чтения из файла
            Scanner scanner = new Scanner(new File("/Users/gerald/IdeaProjects/Java2025/src/practices/practice_23/task/data.txt"));

            //Чтение файла построчно
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
