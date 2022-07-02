import java.util.concurrent.ThreadLocalRandom;

public class Duck extends Herbivores implements Eatable{
    public Duck() {
        weight = 1;
        speed = 4;
        weightForSatiety = 0.15;
    }

    @Override
    public boolean chanceOfBeingEaten(Animal animal) {
        if (animal instanceof Wolf){
            return ThreadLocalRandom.current().nextInt(100) <= 40;
        }
        if (animal instanceof Boa){
            return ThreadLocalRandom.current().nextInt(100) <= 10;
        }
        if (animal instanceof Fox){
            return ThreadLocalRandom.current().nextInt(100) <= 60;
        }
        if (animal instanceof Bear){
            return ThreadLocalRandom.current().nextInt(100) <= 10;
        }
        if (animal instanceof Eagle){
            return ThreadLocalRandom.current().nextInt(100) <= 80;
        }

        return false;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "weight=" + weight +
                ", speed=" + speed +
                ", weightForSatiety=" + weightForSatiety +
                '}';
    }
}
