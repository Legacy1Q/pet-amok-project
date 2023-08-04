package pets_amok;

public class VirtualPet {
    private String name;
    protected int hunger;
    protected int thirst;
    protected int waste;
    protected int boredom;
    protected int health;

    public VirtualPet(String name,  int hunger, int thirst, int waste, int boredom, int health) {
        this.name = name;
        this.hunger = hunger;
        this.thirst = thirst;
        this.waste = waste;
        this.boredom = boredom;
        this.health = health;
    }

    public void tick() {
        hunger += 1;
        thirst += 1;
        waste += 1;
        boredom += 1;
        health -= 1;
    }

    public void feed() {
        hunger -= 5;
        thirst += 1;
        waste += 2;
        boredom += 1;
        health += 1;
    }

    public void water() {
        hunger += 1;
        thirst -= 5;
        waste += 2;
        boredom += 1;
        health += 1;
    }

    public void clean() {
        hunger += 1;
        thirst += 1;
        waste -= 5;
        boredom += 1;
        health += 1;
    }

    public void play() {
        hunger += 1;
        thirst += 1;
        boredom -= 5;
        health += 1;
    }

    public void vet() {
        hunger += 1;
        thirst += 1;
        waste += 1;
        health += 5;
    }

    public void nothing() {
        hunger += 1;
        thirst += 1;
        waste += 1;
        boredom += 2;
        health -= 1;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHunger() {
        return this.hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getThirst() {
        return this.thirst;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public int getWaste() {
        return this.waste;
    }

    public void setWaste(int waste) {
        this.waste = waste;
    }

    public int getBoredom() {
        return this.boredom;
    }

    public void setBoredom(int boredom) {
        this.boredom = boredom;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }


}
