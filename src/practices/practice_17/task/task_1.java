package practices.practice_17.task;

public class task_1 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Alexander Zhukov");

        //Возвращает длину строки
        System.out.println(sb.length());

        //Возвращает символ по индексу
        System.out.println(sb.charAt(0));

        //Добавляет строку в конец
        sb.append(" Java");
        System.out.println(sb);

        //Вставляет строку по индексу
        sb.insert(10, "Vladimirovich ");
        System.out.println(sb);

        //Удаляет часть строки
        sb.delete(10, 22);
        System.out.println(sb);

        StringBuffer sbuf = new StringBuffer("Alexander Zhukov");

        // Заменяет часть строки
        sbuf.replace(10, 16, "Z");
        System.out.println(sbuf);

        //Изменяет символ по индексу
        sbuf.setCharAt(0, 'a');
        System.out.println(sbuf);

        // Переворачивает строку
        sbuf.reverse();
        System.out.println(sbuf);

        //Возвращает текущую ёмкость буфера
        System.out.println(sbuf.capacity());

        //Ппреобразует в объект String
        String result = sbuf.toString();
        System.out.println(result);
    }
}
