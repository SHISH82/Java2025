package practices.practice_10.task;

public class task_1 {

    public static void main(String[] args) {

        Bird sparrow = new Sparrow();
        Bird penguin = new Penguin();

        //Метод с переменным числом параметров
        sparrow.walk(3);
        penguin.walk(10);

        //Вызов методов которые переопределии
        sparrow.printInfo();
        penguin.printInfo();

        //Несколько аргументов
        sparrow.walk(2, 1);
        penguin.walk(4, 6);

        sparrow.printInfo();
        penguin.printInfo();
    }
}


class Bird {

    protected int steps = 0;

    //Метод с переменным числом параметров
    public void walk(int... stepsCount) {
        for (int s : stepsCount) {
            steps += s;
        }
    }

    //Переопределение метода
    public void printInfo() {
        System.out.println("Птица прошла шагов: " + steps);
    }
}


class Sparrow extends Bird {

    //Переопределение
    @Override
    public void printInfo() {
        System.out.println("Воробей прошёл шагов: " + steps);
    }
}


class Penguin extends Bird {

    //Переопределение
    @Override
    public void printInfo() {
        System.out.println("Пингвин прошёл шагов: " + steps);
    }
}
