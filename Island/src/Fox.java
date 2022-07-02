public class Fox extends Predators{
    public Fox() {
        weight = 8;
        speed = 2;
        weightForSatiety = 2;
    }

    @Override
    public String toString() {
        return "Fox{" +
                "weight=" + weight +
                ", speed=" + speed +
                ", weightForSatiety=" + weightForSatiety +
                '}';
    }
}
