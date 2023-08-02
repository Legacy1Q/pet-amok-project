package pets_amok;

public class Organic extends VirtualPet{
    private int cleanliness;

    public Organic(String name, String description, int hunger, int thirst, int waste, int boredom, int sickness, int health, int cleanliness) {
        super(name, description, hunger, thirst, waste, boredom, sickness, health);
        this.cleanliness = cleanliness;
    }

    public void clean() {
        cleanliness -= 5;
    }
    
}
