public class Bear extends Predators {


    public Bear() {
        weight = 400;
        speed = 3;
        weightForSatiety = 200;
        dead = false;
    }

    @Override
    public boolean eat(Animal animal) {
        if (animal instanceof Eatable) {
            return ((Eatable) animal).chanceOfBeingEaten(new Bear());
        } else {
            return false;
        }
    }

    @Override
    public Animal sex(Animal animal) {
        if (animal instanceof Bear){
            return new Bear();
        }
        return null;
    }

    @Override
    public void move() {
        super.move();
    }

    @Override
    public String toString() {
        return "Bear";
    }
}
