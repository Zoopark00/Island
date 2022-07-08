public class Plants extends Animal implements Eatable{
    int weight = 1;
    String AnimalType = String.valueOf(Plants.class);

    @Override
    public boolean chanceOfBeingEaten(Animal animal) {
        if (animal instanceof Herbivores) {
            return true;
        } else return false;
    }

    @Override
    public boolean eat(Animal animal) {
        return true;
    }

    @Override
    public Animal sex(Animal animal) {
        return new Plants();
    }
}
