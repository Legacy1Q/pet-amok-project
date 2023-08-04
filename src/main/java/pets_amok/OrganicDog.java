package pets_amok;

public class OrganicDog extends Organic{
    private int cage;
    
    public OrganicDog(String name, int hunger, int thirst, int waste, int boredom, int health, int cleanliness) {
        super(name, hunger, thirst, waste, boredom, health, cleanliness);
        this.cage = 0;
    }

    public int getCage() {
        return cage;
    }

    public void cleanCage() {
        cage -= 5;
    }

    public void walk() {
        hunger += 1;
        thirst += 1;
        waste += 1;
        boredom -= 5;
        health += 1;
    }

    
}
