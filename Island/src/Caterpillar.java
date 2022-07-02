public class Caterpillar extends Herbivores {
    public Caterpillar() {
        weight = 0.01;
        speed = 1;
        weightForSatiety = 1;
    }

    @Override
    public String toString() {
        return "Caterpillar{" +
                "weight=" + weight +
                ", speed=" + speed +
                ", weightForSatiety=" + weightForSatiety +
                '}';
    }
}
