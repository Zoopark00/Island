import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Cell implements Runnable{
   List<Animal> cellList = new ArrayList<>();
    List<Animal> childList = new ArrayList<>();

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


    public void sex() {
        cellList.sort(Comparator.comparingDouble((Animal a) -> a.weightForSatiety));
        for (int i = 0; i < cellList.size(); i++) {
            for (int j = 1; j < (cellList.size()-i); j++) {
                if (cellList.get(i).sex(cellList.get(j + i)) == null) {
                    break;
                } else {
                    childList.add(cellList.get(i).sex(cellList.get(j + i)));
                    i++;
                }
                break;
            }
        }
        cellList.addAll(childList);
        childList.clear();

    }

    public void eat() {
        for (Animal animal : cellList) {
            animal.isMove = false;
            if (!animal.dead) {
                int victim = ThreadLocalRandom.current().nextInt(cellList.size());
                if (animal.eat(cellList.get(victim))) {
                    cellList.get(victim).dead = true;
                    animal.hungru--;
                } else animal.hungru++;
                if (animal.hungru > 2){
                    animal.dead = true;
                }

            }

        }
        cellList.removeIf(animal -> animal.dead);
    }
    public static  void move(Cell[][] field) {
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                Iterator <Animal> it = field [i][j].cellList.iterator();

                while (it.hasNext()) {
                    Animal animal = it.next();
                    if(map.containsKey(animal.AnimalType)) {
                        map.put(animal.AnimalType, map.get(animal.AnimalType) +1);
                    }else {
                        map.put(animal.AnimalType, 1);
                    }
                    if (!animal.isMove) {
                        if (animal instanceof Plants) {
                            continue;
                        }
                        Random random = new Random();
                        boolean chanse = random.nextBoolean();
                        int speed = random.nextInt(0, animal.speed);
                        if (speed != 0) {

                            if (chanse) {
                                speed = speed * (-1);
                            }
                            int x = i;
                            int y = j;
                            if (chanse) {
                                x = i + speed;
                            } else {
                                y = j + speed;
                            }
                            if (x < 0) {
                                x = x * (-1);
                            }
                            if (x >= field.length) {
                                int xb = random.nextInt(1, animal.speed);
                                x = (field.length) - xb;
                            }
                            if (y < 0) {
                                y = y * (-1);
                            }
                            if (y >= field[0].length) {
                                int yb = random.nextInt(1, animal.speed);
                                y = (field.length) - yb;

                            }

                            if (x!=i && y!=j) {
                                animal.isMove = true;
                                field[x][y].cellList.add(animal);
                                it.remove();
                            }
                        }
                    }
                }

            }

        }
        System.out.println(map.toString());
        System.out.println("End of Iteration");

        map.clear();
    }


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
                for (int k = 0; k < random.nextInt(maxPlants); k++) {
                    field[i][j].cellList.add(new Plants());
                }


            }

        }
        return field;
    }

    @Override
    public void run() {
        eat();
        sex();
    }
}
