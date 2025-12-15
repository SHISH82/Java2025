package practices.practice_3.task;

interface Flyable {
    void fly();
}

class Sparrow implements Flyable {
    @Override
    public void fly() {
        System.out.println("Воробей летает");
    }
}

class Penguin {
    public void swim() {
        System.out.println("Пингвин плавает");
    }
}

public class task_8 {
    public static void main(String[] args) {
        Flyable sparrow = new Sparrow();
        sparrow.fly();

        var penguin = new Penguin();
        penguin.swim();
    }
}
