package pets_amok;

public class OrganicDog extends Organic{
    private int cage;
    
    public OrganicDog(String name, String description, int hunger, int thirst, int waste, int boredom, int sickness, int health, int cleanliness) {
        super(name, description, hunger, thirst, waste, boredom, sickness, health, cleanliness);
        this.cage = 0;
    }

    public int getCage() {
        return cage;
    }

    public void cleanCage() {
        cage -= 5;
    }
    
}
