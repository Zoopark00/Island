import java.util.concurrent.ThreadLocalRandom;

public class Horse extends Herbivores implements Eatable{
    public Horse() {
        weight = 400;
        speed = 4;
        weightForSatiety = 60;
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
