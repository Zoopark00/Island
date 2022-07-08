import java.util.concurrent.ThreadLocalRandom;

public class Boar extends Herbivores implements Eatable{
    public Boar() {
        weight = 400;
        speed = 2;
        weightForSatiety = 55;
        dead = false;
        AnimalType = String.valueOf(Boar.class);
    }

    @Override
    public boolean eat(Animal animal) {
        if (animal instanceof Eatable) {
            return ((Eatable) animal).chanceOfBeingEaten(new Boar());
        } else {
            return false;
        }
    }

    @Override
    public Animal sex(Animal animal) {
        if (animal instanceof Boar){
            return new Boar();
        }
        return null;
    }

    @Override
    public void move() {
        super.move();
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
