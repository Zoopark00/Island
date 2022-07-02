import java.util.concurrent.ThreadLocalRandom;

public class Buffalo extends Herbivores implements Eatable{
    public Buffalo() {
        weight= 700;
        speed = 3;
        weightForSatiety = 50;

    }

    @Override
    public boolean chanceOfBeingEaten(Animal animal) {
        if (animal instanceof Bear) {
            return ThreadLocalRandom.current().nextInt(100) <= 20;
        }
        if (animal instanceof Wolf){
            return ThreadLocalRandom.current().nextInt(100) <= 10;
        }
        return false;
    }

    @Override
    public String   toString() {
        return "Buffalo{" +
                "weight=" + weight +
                ", speed=" + speed +
                ", weightForSatiety=" + weightForSatiety +
                '}';
    }
}
