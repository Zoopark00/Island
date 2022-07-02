import java.util.concurrent.ThreadLocalRandom;

public class Boa extends Predators implements Eatable{

    public Boa() {
    weight = 15;
    speed = 1;
    weightForSatiety = 3;
    }

    @Override
    public boolean eat(Animal animal) {
        return super.eat(animal);
    }

    @Override
    public void sex(Animal animal) {
        super.sex(animal);
    }

    @Override
    public void move() {
        super.move();
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
        return false;
    }

    @Override
    public String toString() {
        return "Boa{" +
                "weight=" + weight +
                ", speed=" + speed +
                ", weightForSatiety=" + weightForSatiety +
                '}';
    }
}
