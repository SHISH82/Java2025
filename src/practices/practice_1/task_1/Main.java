package practices.practice_1.task_1;

class Птица {
    public void летать() {
        System.out.println("Птица летает");
    }
}

class Воробей extends Птица {
    @Override
    public void летать() {
        System.out.println("Воробей летает");
    }
}

class Пингвин extends Птица {
    @Override
    public void летать() {
        throw new UnsupportedOperationException("Пингвины не умеют летать");
    }
}

public class Main {
    public static void main(String[] args) {


        Птица птица1 = new Воробей();
        птица1.летать();

        try {
            Птица птица2 = new Пингвин();
            птица2.летать();
        } catch (UnsupportedOperationException e) {
            System.out.println("Ошибка:" + e.getMessage());
        }
    }
}
//test
