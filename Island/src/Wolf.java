public class Wolf extends Predators{
    public Wolf() {
        weight = 50;
        speed = 3;
        weightForSatiety = 8;
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "weight=" + weight +
                ", speed=" + speed +
                ", weightForSatiety=" + weightForSatiety +
                '}';
    }
}
