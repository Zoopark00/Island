public class Bear extends Predators {


    public Bear() {
        weight = 400;
        speed = 3;
        weightForSatiety = 200;


    }

    @Override
    public boolean eat(Animal animal) {
       if (animal instanceof Eatable){
       return ((Eatable) animal).chanceOfBeingEaten(this);
       } else {
           return false;
       }
    }

    @Override
    public void sex(Animal animal) {

    }

    @Override
    public void move() {
        super.move();
    }

    @Override
    public String toString() {
        return "Bear{" +
                "weight=" + weight +
                ", speed=" + speed +
                ", weightForSatiety=" + weightForSatiety +
                '}';
    }
}
