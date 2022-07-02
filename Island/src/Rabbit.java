public class Rabbit extends Herbivores{
    public Rabbit() {
        weight = 2;
        speed = 2;
        weightForSatiety = 0.45;
    }

    @Override
    public String toString() {
        return "Rabbit{" +
                "weight=" + weight +
                ", speed=" + speed +
                ", weightForSatiety=" + weightForSatiety +
                '}';
    }
}
