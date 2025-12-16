package practices.practice_11.task;

//Перечисление enum
enum PenguinActivity {

    SLEEPING(false),
    WALKING(true),
    SWIMMING(true);


    private final boolean active;

    //Конструктор перечисления
    PenguinActivity(boolean active) {
        this.active = active;
    }

    //Доп метод
    public boolean isActive() {
        return active;
    }
}

public class task_2 {

    public static void main(String[] args) {

        PenguinActivity activity = PenguinActivity.SWIMMING;

        System.out.println("Активность: " + activity);
        System.out.println("Активен ли пингвин: " + activity.isActive());
    }
}
