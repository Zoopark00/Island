import java.util.concurrent.ThreadLocalRandom;

public class Rabbit extends Herbivores implements Eatable{
    public Rabbit() {
        weight = 2;
        speed = 2;
        weightForSatiety = 0.45;
    }

    @Override
    public boolean chanceOfBeingEaten(Animal animal) {
        if (animal instanceof Wolf){
            return ThreadLocalRandom.current().nextInt(100) <= 60;
        }
        if (animal instanceof Boa){
            return ThreadLocalRandom.current().nextInt(100) <= 20;
        }
        if (animal instanceof Fox){
            return ThreadLocalRandom.current().nextInt(100) <= 70;
        }
        if (animal instanceof Bear){
            return ThreadLocalRandom.current().nextInt(100) <= 80;
        }
        if (animal instanceof Eagle){
            return ThreadLocalRandom.current().nextInt(100) <= 90;
        }

        return false;
    }

    @Override
    public String toString() {
        return "Rabbit";
    }
}
