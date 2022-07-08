import java.util.concurrent.ThreadLocalRandom;

public class Mouse extends Herbivores implements Eatable {
    public Mouse() {
        weight = 0.05;
        speed = 1;
        weightForSatiety = 0.01;
        dead = false;
        AnimalType = String.valueOf(Mouse.class);
    }
    @Override
    public boolean eat(Animal animal) {
        if (animal instanceof Eatable) {
            return ((Eatable) animal).chanceOfBeingEaten(new Mouse());
        } else {
            return false;
        }
    }

    @Override
    public Animal sex(Animal animal) {
        if (animal instanceof Mouse){
            return new Mouse();
        }
        return null;
    }

    @Override
    public boolean chanceOfBeingEaten(Animal animal) {
        if (animal instanceof Wolf) {
            return ThreadLocalRandom.current().nextInt(100) <= 80;
        }
        if (animal instanceof Boa) {
            return ThreadLocalRandom.current().nextInt(100) <= 40;
        }
        if (animal instanceof Fox) {
            return ThreadLocalRandom.current().nextInt(100) <= 90;
        }
        if (animal instanceof Eagle) {
            return ThreadLocalRandom.current().nextInt(100) <= 90;
        }
        if (animal instanceof Bear) {
            return ThreadLocalRandom.current().nextInt(100) <= 90;
        }


        return false;

    }

    @Override
    public String toString() {
        return "Mouse{" +
                "weight=" + weight +
                ", speed=" + speed +
                ", weightForSatiety=" + weightForSatiety +
                '}';
    }
}
