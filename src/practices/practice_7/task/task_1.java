package practices.practice_7.task;

import java.util.Arrays;

public class task_1 {

    public static void main(String[] args) {

        int[] a = {5, 3, 1, 4, 2};
        int[] b = {1, 2, 3, 4, 5};

        // toString массив в строку
        System.out.println(Arrays.toString(a));

        // sort cортировка массива по возрастанию
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        // binarySearch поиск элемента в отсортированном массиве и возвращает индекс элемента
        int index = Arrays.binarySearch(a, 3);
        System.out.println(index);

        // equals сравнение массивов по элементам
        boolean isEqual = Arrays.equals(a, b);
        System.out.println(isEqual);

        // compare сравнение массивов 0(равны) -1(первый меньше) 1(первый больше)
        int compareResult = Arrays.compare(a, b);
        System.out.println(compareResult);
    }
}
