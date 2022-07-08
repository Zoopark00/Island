import java.util.concurrent.ThreadLocalRandom;

public class Horse extends Herbivores implements Eatable{
    public Horse() {
        weight = 400;
        speed = 4;
        weightForSatiety = 60;
        dead = false;
        AnimalType = String.valueOf(Horse.class);
    }
    @Override
    public boolean eat(Animal animal) {
        if (animal instanceof Eatable) {
            return ((Eatable) animal).chanceOfBeingEaten(new Horse());
        } else {
            return false;
        }
    }

    @Override
    public Animal sex(Animal animal) {
        if (animal instanceof Horse){
            return new Horse();
        }
        return null;
    }

    @Override
    public boolean chanceOfBeingEaten(Animal animal) {
        if (animal instanceof Wolf){
            return ThreadLocalRandom.current().nextInt(100) <= 10;
        }
        if (animal instanceof Bear){
            return ThreadLocalRandom.current().nextInt(100) <= 40;
        }

          return false;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "weight=" + weight +
                ", speed=" + speed +
                ", weightForSatiety=" + weightForSatiety +
                '}';
    }
}
