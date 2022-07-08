import java.util.concurrent.ThreadLocalRandom;

public class Sheep extends Herbivores implements Eatable{
    public Sheep() {
        weight = 70;
        speed = 3;
        weightForSatiety = 15;
        dead = false;
        AnimalType = String.valueOf(Sheep.class);
    }
    @Override
    public boolean eat(Animal animal) {
        if (animal instanceof Eatable) {
            return ((Eatable) animal).chanceOfBeingEaten(new Sheep());
        } else {
            return false;
        }
    }

    @Override
    public Animal sex(Animal animal) {
        if (animal instanceof Sheep){
            return new Sheep();
        }
        return null;
    }

    @Override
    public boolean chanceOfBeingEaten(Animal animal) {
        if (animal instanceof Wolf){
            return ThreadLocalRandom.current().nextInt(100) <= 70;
        }
        if (animal instanceof Bear){
            return ThreadLocalRandom.current().nextInt(100) <= 70;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "weight=" + weight +
                ", speed=" + speed +
                ", weightForSatiety=" + weightForSatiety +
                '}';
    }
}
