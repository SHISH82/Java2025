package practices.practice_6.task;

class Sparrow {
    void fly() {
        System.out.println("Воробей летает");
    }
}

class Penguin {
    void swim() {
        System.out.println("Пингвин плавает");
    }
}

public class task_2 {

    public static void main(String[] args) {

        Sparrow sparrow = new Sparrow();
        Penguin penguin = new Penguin();

        for (int i = 1; i <= 5; i++) {

            if (i == 2) {
                continue; // пропускаем итерацию
            }

            if (i == 4) {
                break; // выходим из цикла
            }

            if (i % 2 == 0) {
                penguin.swim();
            } else {
                sparrow.fly();
            }
        }
    }
}
