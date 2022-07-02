public class Boa extends Predators{

    public Boa() {
    weight = 15;
    speed = 1;
    weightForSatiety = 3;
    }

    @Override
    public String toString() {
        return "Boa{" +
                "weight=" + weight +
                ", speed=" + speed +
                ", weightForSatiety=" + weightForSatiety +
                '}';
    }
}
