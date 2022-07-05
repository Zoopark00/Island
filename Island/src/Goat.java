import java.util.concurrent.ThreadLocalRandom;

public class Goat extends Herbivores implements Eatable{
    public Goat() {
        weight = 60;
        speed = 3;
        weightForSatiety = 10;
        dead = false;
    }
    @Override
    public boolean eat(Animal animal) {
        if (animal instanceof Eatable) {
            return ((Eatable) animal).chanceOfBeingEaten(new Goat());
        } else {
            return false;
        }
    }

    @Override
    public Animal sex(Animal animal) {
        if (animal instanceof Goat){
            return new Goat();
        }
        return null;
    }
    @Override
    public boolean chanceOfBeingEaten(Animal animal) {
        if (animal instanceof Wolf){
            return ThreadLocalRandom.current().nextInt(100) <= 60;
        }
        if (animal instanceof Bear){
            return ThreadLocalRandom.current().nextInt(100) <= 70;
        }


        return false;
    }

    @Override
    public String toString() {
        return "Goat{" +
                "weight=" + weight +
                ", speed=" + speed +
                ", weightForSatiety=" + weightForSatiety +
                '}';
    }
}
