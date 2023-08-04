package pets_amok;

public class OrganicCat extends Organic{
    private int litterBox;
    
    public OrganicCat(String name, int hunger, int thirst, int waste, int boredom, int health, int cleanliness) {
        super(name, hunger, thirst, waste, boredom, health, cleanliness);
        this.litterBox = 0;
    }

    public int getLitterBox() {
        return litterBox;
    }

    public void cleanLitterBox() {
        litterBox -= 5;
    }
}
