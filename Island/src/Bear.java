public class Bear extends Predators {


    public Bear() {
        weight = 400;
        speed = 3;
        weightForSatiety = 200;

    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void sex() {
        super.sex();
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
