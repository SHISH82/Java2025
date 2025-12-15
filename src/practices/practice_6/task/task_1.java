package practices.practice_6.task;

class crow {
    void fly() {
        System.out.println("Ворона летает");
    }
}

class King_Penguin {
    void swim() {
        System.out.println("Пингвин плавает");
    }
}

public class task_1 {

    public static void main(String[] args) {

        crow crow = new crow();
        King_Penguin King_Penguin = new King_Penguin();

        // Бесконечный цикл while
        while (true) {
            crow.fly();
            break; // break чтобы программа не зависала
        }//test

        // Бесконечный цикл do-while
        do {
            King_Penguin.swim();
            //  break; // break
        } while (true);
    }
}
