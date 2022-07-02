public class Bear extends Predators{
    public Bear(double weight, int speed, double weightForSatiety, int speed1, double weightForSatiety1, double weight1) {
        super(weight, speed, weightForSatiety);
        this.speed = speed1;
        this.weightForSatiety = weightForSatiety1;
        this.weight = weight1;
    }

    private int speed = 2;
        private double weightForSatiety=80;
        private double weight = 500;

    public int getSpeed() {
        return speed;
    }

    public double getWeightForSatiety() {
        return weightForSatiety;
    }

    public double getWeight() {
        return weight;
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
