public class Goat extends Herbivores{
    public Goat() {
        weight = 60;
        speed = 3;
        weightForSatiety = 10;
    }

    @Override
    public String toString() {
        return "Goat{" +
                "weight=" + weight +
                ", speed=" + speed +
                ", weightForSatiety=" + weightForSatiety +
                '}';
    }
}
