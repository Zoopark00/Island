import java.util.concurrent.ThreadLocalRandom;

public class Caterpillar extends Herbivores implements Eatable{
    public Caterpillar() {
        weight = 0.01;
        speed = 1;
        weightForSatiety = 1;
        dead = false;
    }
    @Override
    public boolean eat(Animal animal) {
        if (animal instanceof Eatable) {
            return ((Eatable) animal).chanceOfBeingEaten(new Caterpillar());
        } else {
            return false;
        }
    }

    @Override
    public Animal sex(Animal animal) {
        if (animal instanceof Caterpillar){
            return new Caterpillar();
        }
        return null;
    }

    @Override
    public boolean chanceOfBeingEaten(Animal animal) {
        if (animal instanceof Fox) {
            return ThreadLocalRandom.current().nextInt(100) <= 40;
        }
        if (animal instanceof Mouse){
            return ThreadLocalRandom.current().nextInt(100) <= 90;
        }
        if (animal instanceof Boar){
            return ThreadLocalRandom.current().nextInt(100) <= 90;
        }
        if (animal instanceof Duck){
            return ThreadLocalRandom.current().nextInt(100) <= 90;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Caterpillar{" +
                "weight=" + weight +
                ", speed=" + speed +
                ", weightForSatiety=" + weightForSatiety +
                '}';
    }
}
