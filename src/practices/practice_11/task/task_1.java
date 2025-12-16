package practices.practice_11.task;

public class task_1 {

    public static void main(String[] args) {
        Penguin penguin = new Penguin(PenguinType.EMPEROR);
        penguin.printInfo();
    }
}

//Перечисление enum
enum PenguinType {

    EMPEROR(120, "Антарктида"),
    KING(100, "Южные острова"),
    ADELIE(70, "Антарктическое побережье");

    //Поля перечисления
    private final int heightCm;
    private final String habitat;

    //Конструктор
    PenguinType(int heightCm, String habitat) {
        this.heightCm = heightCm;
        this.habitat = habitat;
    }

    public int getHeightCm() {
        return heightCm;
    }

    public String getHabitat() {
        return habitat;
    }
}

//Класс c enum
class Penguin {

    private final PenguinType type;

    public Penguin(PenguinType type) {
        this.type = type;
    }

    public void printInfo() {
        System.out.println(
                "Тип пингвина: " + type +
                        ", рост: " + type.getHeightCm() + " см" +
                        ", среда обитания: " + type.getHabitat()
        );
    }
}
