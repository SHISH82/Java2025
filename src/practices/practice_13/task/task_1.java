package practices.practice_13.task;


class Sparrow {

    private String type;
    private int distance;

    public Sparrow(String type, int distance) {
        this.type = type;
        this.distance = distance;
    }

    @Override
    public boolean equals(Object obj) {

        //Проверка на сравнение с самим собой
        if (this == obj) {
            return true;
        }

        //Проверка на null
        if (obj == null) {
            return false;
        }

        //Проверка, что объекты одного класса
        if (getClass() != obj.getClass()) {
            return false;
        }

        //Приведение типа
        Sparrow other = (Sparrow) obj;

        //Сравнение значимых полей
        return distance == other.distance &&
                type.equals(other.type);
    }
}
public class task_1 {

    public static void main(String[] args) {

        Sparrow s1 = new Sparrow("Домашний", 120);
        Sparrow s2 = new Sparrow("Домашний", 120);
        Sparrow s3 = new Sparrow("Полевой", 80);

        System.out.println(s1.equals(s1));
        System.out.println(s1.equals(s2) && s2.equals(s1));
        System.out.println(s1.equals(s2) && s2.equals(s3) && s1.equals(s3));
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(null));
        System.out.println(s1.equals(s3));

    }
}
