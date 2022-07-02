public class Deer extends Herbivores{
    public Deer() {
        weight = 300;
        speed = 4;
        weightForSatiety = 50;

    }

    @Override
    public String toString() {
        return "Deer{" +
                "weight=" + weight +
                ", speed=" + speed +
                ", weightForSatiety=" + weightForSatiety +
                '}';
    }
}
