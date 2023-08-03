package pets_amok;

public class OrganicCat extends Organic{
    private int litterBox;
    
    public OrganicCat(String name, String description, int hunger, int thirst, int waste, int boredom, int sickness, int health, int cleanliness) {
        super(name, description, hunger, thirst, waste, boredom, sickness, health, cleanliness);
        this.litterBox = 0;
    }

    public int getLitterBox() {
        return litterBox;
    }

    public void cleanLitterBox() {
        litterBox -= 5;
    }
}
