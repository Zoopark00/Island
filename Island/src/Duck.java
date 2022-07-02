public class Duck extends Herbivores{
    public Duck() {
        weight = 1;
        speed = 4;
        weightForSatiety = 0.15;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "weight=" + weight +
                ", speed=" + speed +
                ", weightForSatiety=" + weightForSatiety +
                '}';
    }
}
