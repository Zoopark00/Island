public class Eagle extends Predators{
    public Eagle() {
        weight = 6;
        speed = 3;
        weightForSatiety = 1;
        dead = false;

    }
    @Override
    public boolean eat(Animal animal) {
        if (animal instanceof Eatable) {
            return ((Eatable) animal).chanceOfBeingEaten(new Eagle());
        } else {
            return false;
        }
    }

    @Override
    public Animal sex(Animal animal) {
        if (animal instanceof Eagle){
            return new Eagle();
        }
        return null;
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
