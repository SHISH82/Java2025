package practices.practice_9.task;

public class task_1 {

    public static void main(String[] args) {

        Bird sparrow = new Sparrow();
        Bird penguin = new Penguin();

        //Перегруженный метод (int)
        sparrow.eatFish(1);
        penguin.eatFish(5);

        //Переопределенные методы
        sparrow.printInfo();
        penguin.printInfo();

        // Перегрузка метода (int int)
        sparrow.eatFish(1, 2);
        penguin.eatFish(3, 4);

        sparrow.printInfo();
        penguin.printInfo();
    }
}

class Bird {

    protected int eatenFish = 0;

    // Перегрузка
    public void eatFish(int count) {
        eatenFish += count;
    }

    // Перегрузка
    public void eatFish(int morning, int evening) {
        eatenFish += morning + evening;
    }

    // Метод для переопределения
    public void printInfo() {
        System.out.println("Птица съела рыбы: " + eatenFish);
    }
}

class Sparrow extends Bird {

    // Переопределение
    @Override
    public void printInfo() {
        System.out.println("Воробей съел рыбы: " + eatenFish);
    }
}

class Penguin extends Bird {

    // Переопределение
    @Override
    public void printInfo() {
        System.out.println("Пингвин съел рыбы: " + eatenFish);
    }
}
