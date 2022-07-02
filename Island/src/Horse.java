public class Horse extends Herbivores{
    public Horse() {
        weight = 400;
        speed = 4;
        weightForSatiety = 60;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "weight=" + weight +
                ", speed=" + speed +
                ", weightForSatiety=" + weightForSatiety +
                '}';
    }
}
