public class Wolf extends Predators{
    public Wolf() {
        weight = 50;
        speed = 3;
        weightForSatiety = 8;
        dead = false;
        AnimalType = String.valueOf(Wolf.class);
    }
    @Override
    public boolean eat(Animal animal) {
        if (animal instanceof Eatable) {
            return ((Eatable) animal).chanceOfBeingEaten(new Wolf());
        } else {
            return false;
        }
    }

    @Override
    public Animal sex(Animal animal) {
        if (animal instanceof Wolf){
            return new Wolf();
        }
        return null;
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "weight=" + weight +
                ", speed=" + speed +
                ", weightForSatiety=" + weightForSatiety +
                '}';
    }
}
