package pets_amok;

public class Robotic extends VirtualPet{
    private int oilLevel;

    public Robotic(String name, String description, int hunger, int thirst, int waste, int boredom, int sickness, int health, int oilLevel) {
        super(name, description, hunger, thirst, waste, boredom, sickness, health);
        this.oilLevel = oilLevel;
    }

    public void oil() {
        oilLevel -= 5;
    }
    
}
