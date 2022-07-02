public class Boar extends Herbivores{
    public Boar() {
        weight = 400;
        speed = 2;
        weightForSatiety = 50;
    }

    @Override
    public String toString() {
        return "Boar{" +
                "weight=" + weight +
                ", speed=" + speed +
                ", weightForSatiety=" + weightForSatiety +
                '}';
    }
}
