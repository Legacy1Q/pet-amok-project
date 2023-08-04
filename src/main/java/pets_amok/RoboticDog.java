package pets_amok;

public class RoboticDog  extends Robotic{
    public RoboticDog(String name, int hunger, int thirst, int waste, int boredom, int health, int oilLevel) {
        super(name, hunger, thirst, waste, boredom, health, oilLevel);
    }

    public void walk() {
        hunger += 1;
        thirst += 1;
        waste += 1;
        boredom -= 5;
        health += 1;
    }

    
}
