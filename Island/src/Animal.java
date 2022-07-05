public abstract class Animal {
    double weight;
    int speed;
    double weightForSatiety;
    int chanceOfBeingEaten;
    boolean dead ;
    int hungru = 0 ;

    public boolean eat(Animal animal) {
        if (animal instanceof Eatable){
            return ((Eatable) animal).chanceOfBeingEaten(this);
        } else {
            return false;
        }
    }

    public Animal sex(Animal animal){
        return null;
    }

    public void move (){

    }

}


