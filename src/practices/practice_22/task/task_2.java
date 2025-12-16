package practices.practice_22.task;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.IOException;

public class task_2 {

    public static void main(String[] args) throws IOException {

        //подкласс OutputStream(для вывода)
        OutputStream output = System.out;

        //Запись байтов в поток
        output.write(65); // A
        output.write(66); // B
        output.write(67); // C

        output.close();

    }
}
