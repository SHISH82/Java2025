package practices.practice_15.task;


interface Bird {

    //Неабстрактный (default) метод
    default void fly() {
        System.out.println("Птица летает");
    }

    //Статический метод интерфейса
    static void info() {
        System.out.println("Интерфейс Bird");
    }
}

//Класс реализующий интерфейс
class Sparrow implements Bird {

    //Переопределение
    @Override
    public void fly() {
        System.out.println("Воробей летает");
    }
}
public class task_1 {

    public static void main(String[] args) {

        //Вызов через ссылку на интерфейс
        Bird bird1 = new Sparrow();
        bird1.fly();

        //Вызов через объект класса реализации
        Sparrow sparrow = new Sparrow();
        sparrow.fly();

        // Вызов static-метода интерфейса
        Bird.info();
    }
}