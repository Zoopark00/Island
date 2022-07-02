import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Deer extends Herbivores implements Eatable{
    public Deer() {
        weight = 300;
        speed = 4;
        weightForSatiety = 50;
    }


    @Override
    public String toString() {
        return "Deer{" +
                "weight=" + weight +
                ", speed=" + speed +
                ", weightForSatiety=" + weightForSatiety +
                '}';
    }

    @Override
    public boolean chanceOfBeingEaten(Animal animal) {
        if (animal instanceof Bear) {
            if (ThreadLocalRandom.current().nextInt(100) <= 80) {
            return true;
            }else {
                return false;
            }
        }
        if (animal instanceof Wolf){
            if (ThreadLocalRandom.current().nextInt(100) <= 15) {
                return true;
            }else {
                return false;
            }
        }
        return false;
    }
}
