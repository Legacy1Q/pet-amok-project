package pets_amok;

public class Organic extends VirtualPet{
    private int cleanliness;

    public Organic(String name, int hunger, int thirst, int waste, int boredom, int health, int cleanliness) {
        super(name, hunger, thirst, waste, boredom, health);
        this.cleanliness = cleanliness;
    }

    public void clean() {
        cleanliness -= 5;
    }

    public int getCleanliness() {
        return cleanliness;
    }

    @Override
    public void tick() {
        super.tick();
        cleanliness += 1;
    }
    
}
