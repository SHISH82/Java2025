package practices.practice_14.task;

//Интерфейс
interface Bird {

    //Вложенный класс в интерфейсе
    class Helper {

        public static void printInfo() {
            System.out.println("Вложенный класс в интерфейсе Bird");
        }
    }
}
public class task_1 {

    public static void main(String[] args) {
        //Вызов метода вложенного класса интерфейса
        Bird.Helper.printInfo();
    }
}