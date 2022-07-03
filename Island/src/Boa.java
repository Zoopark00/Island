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
    public Animal sex(Animal animal) {
       if( animal instanceof Boa){
           return new Boa();
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
            return ThreadLocalRandom.current().nextInt(100) <= 80;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Boa";
    }
}
