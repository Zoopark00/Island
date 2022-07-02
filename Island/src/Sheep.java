import java.util.concurrent.ThreadLocalRandom;

public class Sheep extends Herbivores implements Eatable{
    public Sheep() {
        weight = 70;
        speed = 3;
        weightForSatiety = 15;

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
