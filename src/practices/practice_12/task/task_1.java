package practices.practice_12.task;

public class task_1 {

    public static void main(String[] args) {
        Child child = new Child(100);
        child.printValues();
    }
}

//Суперкласс
class Parent {

    protected int value = 10;

    public Parent(int value) {
        this.value = value;
        System.out.println("Конструктор суперкласса, value = " + value);
    }

    public void show() {
        System.out.println("Метод суперкласса, value = " + value);
    }
}

//Подкласс
class Child extends Parent {

    private int value = 20;

    public Child(int value) {
        //Вызов конструктора суперкласса
        super(value);
        System.out.println("Конструктор подкласса");
    }

    public void printValues() {
        //Доступ к полю суперкласса
        System.out.println("Поле суперкласса: " + super.value);

        //Доступ к методу суперкласса
        super.show();
    }
}
