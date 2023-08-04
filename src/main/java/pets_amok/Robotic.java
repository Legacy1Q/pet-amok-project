package pets_amok;

public class Robotic extends VirtualPet{
    private int oilLevel;

    public Robotic(String name, int hunger, int thirst, int waste, int boredom, int health, int oilLevel) {
        super(name, hunger, thirst, waste, boredom, health);
        this.oilLevel = oilLevel;
    }

    public void oil() {
        oilLevel += 2;
    }

    public int getOilLevel() {
        return oilLevel;
    }

    @Override
    public void tick() {
        super.tick();
        oilLevel -= 1;
    }

    
}
