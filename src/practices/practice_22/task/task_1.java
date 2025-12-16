package practices.practice_22.task;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.IOException;

public class task_1 {

    public static void main(String[] args) throws IOException {

        byte[] data = {65, 66, 67}; // байты для символов A, B, C

        //Входной байтовый поток
        InputStream input = new ByteArrayInputStream(data);

        int b;
        while ((b = input.read()) != -1) {//Чтение данных из потока (получаем байт или -1)
            System.out.println((char) b);//Приводим к символу
        }

        input.close();
    }
}
