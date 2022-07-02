import java.util.concurrent.ThreadLocalRandom;

public class Caterpillar extends Herbivores implements Eatable{
    public Caterpillar() {
        weight = 0.01;
        speed = 1;
        weightForSatiety = 1;
    }

    @Override
    public boolean chanceOfBeingEaten(Animal animal) {
        if (animal instanceof Fox) {
            if (ThreadLocalRandom.current().nextInt(100) <= 40) {
                return true;
            }else {
                return false;
            }
        }
        if (animal instanceof Mouse){
            if (ThreadLocalRandom.current().nextInt(100) <= 90) {
                return true;
            }else {
                return false;
            }
        }
        if (animal instanceof Boar){
            if (ThreadLocalRandom.current().nextInt(100) <= 90) {
                return true;
            }else {
                return false;
            }
        }
        if (animal instanceof Duck){
            if (ThreadLocalRandom.current().nextInt(100) <= 90) {
                return true;
            }else {
                return false;
            }
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
