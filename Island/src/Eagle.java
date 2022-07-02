public class Eagle extends Predators{
    public Eagle() {
        weight = 6;
        speed = 3;
        weightForSatiety = 1;

    }

    @Override
    public String toString() {
        return "Igle{" +
                "weight=" + weight +
                ", speed=" + speed +
                ", weightForSatiety=" + weightForSatiety +
                '}';
    }
}
