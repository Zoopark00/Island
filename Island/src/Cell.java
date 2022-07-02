import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cell {
    List<Animal> cellList = new ArrayList<>();
    static int maxWolf = 30;
    static int maxBoa = 30;
    static int maxFox = 50;
    static int maxBear = 5;
    static int maxEagle = 20;
    static int maxHorse = 20;
    static int maxDeer = 20;
    static int maxRabbit = 150;
    static int maxMouse = 500;
    static int maxGoat = 140;
    static int maxSheep = 140;
    static int maxBoar = 50;
    static int maxBuffalo = 10;
    static int maxDuck = 200;
    static int maxCaterpillar = 1000;
    static int maxPlants = 200;


    public static Cell[][] createField() {

        Cell[][] field = new Cell[20][100];
        Random random = new Random();
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                field[i][j] = new Cell();
                for (int k = 0; k < random.nextInt(maxBear); k++) {
                    field[i][j].cellList.add(new Bear());
                }
                for (int k = 0; k < random.nextInt(maxBoa); k++) {
                    field[i][j].cellList.add(new Boa());
                }
                for (int k = 0; k < random.nextInt(maxBoar); k++) {
                    field[i][j].cellList.add(new Boar());
                }
                for (int k = 0; k < random.nextInt(maxBuffalo); k++) {
                    field[i][j].cellList.add(new Buffalo());
                }
                for (int k = 0; k < random.nextInt(maxCaterpillar); k++) {
                    field[i][j].cellList.add(new Caterpillar());
                }
                for (int k = 0; k < random.nextInt(maxDeer); k++) {
                    field[i][j].cellList.add(new Deer());
                }
                for (int k = 0; k < random.nextInt(maxDuck); k++) {
                    field[i][j].cellList.add(new Duck());
                }
                for (int k = 0; k < random.nextInt(maxEagle); k++) {
                    field[i][j].cellList.add(new Eagle());
                }
                for (int k = 0; k < random.nextInt(maxFox); k++) {
                    field[i][j].cellList.add(new Fox());
                }
                for (int k = 0; k < random.nextInt(maxGoat); k++) {
                    field[i][j].cellList.add(new Goat());
                }
                for (int k = 0; k < random.nextInt(maxHorse); k++) {
                    field[i][j].cellList.add(new Horse());
                }
                for (int k = 0; k < random.nextInt(maxMouse); k++) {
                    field[i][j].cellList.add(new Mouse());
                }
                for (int k = 0; k < random.nextInt(maxRabbit); k++) {
                    field[i][j].cellList.add(new Rabbit());
                }
                for (int k = 0; k < random.nextInt(maxSheep); k++) {
                    field[i][j].cellList.add(new Sheep());
                }
                for (int k = 0; k < random.nextInt(maxWolf); k++) {
                    field[i][j].cellList.add(new Wolf());
                }


            }

        }
        return field;
    }

}
