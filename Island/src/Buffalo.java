public class Buffalo extends Herbivores{
    public Buffalo() {
        weight= 700;
        speed = 3;
        weightForSatiety = 50;

    }

    @Override
    public String   toString() {
        return "Buffalo{" +
                "weight=" + weight +
                ", speed=" + speed +
                ", weightForSatiety=" + weightForSatiety +
                '}';
    }
}
