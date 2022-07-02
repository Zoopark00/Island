public class Mouse extends Herbivores{
    public Mouse() {
        weight = 0.05;
        speed = 1;
        weightForSatiety = 0.01;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "weight=" + weight +
                ", speed=" + speed +
                ", weightForSatiety=" + weightForSatiety +
                '}';
    }
}
