package practices.practice_16.task;

public class task_1 {

    public static void main(String[] args) {

        String text = "Alexander Zhukov";

        //Возвращает длину строки
        System.out.println(text.length());

        //Возвращает символ по индексу
        System.out.println(text.charAt(1));

        //Возвращает подстроку с указанного индекса
        System.out.println(text.substring(6));

        //Подстрока в заданном диапазоне
        System.out.println(text.substring(0, 5));

        //Переводит строку в верхний регистр
        System.out.println(text.toUpperCase());

        //Переводит строку в нижний регистр
        System.out.println(text.toLowerCase());

        //Проверяет содержит ли строка подстроку
        System.out.println(text.contains("Java"));

        //Заменяет часть строки
        System.out.println(text.replace("Zhukov", "Petrov"));

        //Проверяет, начинается ли строка с указанного префикса
        System.out.println(text.startsWith("Alexander"));

        //Разбивает строку на массив строк
        String[] words = text.split(" ");
        System.out.println();
        for (String word : words) {
            System.out.println(word);
        }
    }
}
