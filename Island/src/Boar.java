import java.util.concurrent.ThreadLocalRandom;

public class Boar extends Herbivores implements Eatable{
    public Boar() {
        weight = 400;
        speed = 2;
        weightForSatiety = 50;
    }

    @Override
    public boolean chanceOfBeingEaten(Animal animal) {
        if (animal instanceof Bear) {
            return ThreadLocalRandom.current().nextInt(100) <= 50;
        }
        if (animal instanceof Wolf){
            return ThreadLocalRandom.current().nextInt(100) <= 15;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Boar{" +
                "weight=" + weight +
                ", speed=" + speed +
                ", weightForSatiety=" + weightForSatiety +
                '}';
    }
}
