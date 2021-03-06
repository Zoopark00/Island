import java.util.concurrent.ThreadLocalRandom;

public class Fox extends Predators implements Eatable {
    public Fox() {
        weight = 8;
        speed = 2;
        weightForSatiety = 2;
        dead = false;
        AnimalType = String.valueOf(Fox.class);
    }
    @Override
    public boolean eat(Animal animal) {
        if (animal instanceof Eatable) {
            return ((Eatable) animal).chanceOfBeingEaten(new Fox());
        } else {
            return false;
        }
    }

    @Override
    public Animal sex(Animal animal) {
        if (animal instanceof Fox){
            return new Fox();
        }
        return null;
    }

    @Override
    public boolean chanceOfBeingEaten(Animal animal) {
        if (animal instanceof Boa) {
            return ThreadLocalRandom.current().nextInt(100) <= 15;
        }
        if (animal instanceof Eagle) {
            return ThreadLocalRandom.current().nextInt(100) <= 10;
        }

        return false;
    }

    @Override
    public String toString() {
        return "Fox";
    }
}
