package practices.practice_12.task;

public class task_3 {

    public static void main(String[] args) {
        A obj1 = new A();
        A obj2 = new A(10);
        A obj3 = new A(10, 20);
        A obj4 = new A(10, 20, 30);
    }
}

class A {
    int a;
    int b;
    int c;
    int z;

    public A() {
        z = 1;
    }

    public A(int a) {
        this();        // вызов конструктора без параметров
        this.a = a;

    }

    public A(int a, int b) {
        this(a);       // вызов конструктора с одним параметром
        this.b = b;
    }

    public A(int a, int b, int c) {
        this(a, b);    // вызов конструктора с двумя параметрами
        this.c = c;
        System.out.println("A(int, int, int): c = " + c);
    }
}
