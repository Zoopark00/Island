public class Sheep extends Herbivores {
    public Sheep() {
        weight = 70;
        speed = 3;
        weightForSatiety = 15;

    }

    @Override
    public String toString() {
        return "Sheep{" +
                "weight=" + weight +
                ", speed=" + speed +
                ", weightForSatiety=" + weightForSatiety +
                '}';
    }
}
