public abstract class Animal {
     double weight;
    int speed;
    double weightForSatiety;
    int chanceOfBeingEaten;

    public boolean eat(Animal animal) {
        if (animal instanceof Eatable){
            return ((Eatable) animal).chanceOfBeingEaten(this);
        } else {
            return false;
        }
    }

    public void sex(Animal animal){

    }

    public void move (){

    }

}


