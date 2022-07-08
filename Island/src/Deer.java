import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Deer extends Herbivores implements Eatable{
    public Deer() {
        weight = 300;
        speed = 4;
        weightForSatiety = 50;
        dead = false;
        AnimalType = String.valueOf(Deer.class);
    }
    @Override
    public boolean eat(Animal animal) {
        if (animal instanceof Eatable) {
            return ((Eatable) animal).chanceOfBeingEaten(new Deer());
        } else {
            return false;
        }
    }

    @Override
    public Animal sex(Animal animal) {
        if (animal instanceof Deer){
            return new Deer();
        }
        return null;
    }


    @Override
    public String toString() {
        return "Deer{" +
                "weight=" + weight +
                ", speed=" + speed +
                ", weightForSatiety=" + weightForSatiety +
                '}';
    }

    @Override
    public boolean chanceOfBeingEaten(Animal animal) {
        if (animal instanceof Bear) {
            return ThreadLocalRandom.current().nextInt(100) <= 80;
        }
        if (animal instanceof Wolf){
            return ThreadLocalRandom.current().nextInt(100) <= 15;
        }
        return false;
    }
}
