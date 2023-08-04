package pets_amok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
    private Map<String, VirtualPet> pets = new HashMap<>();

    // Methods for managing pets
    public Collection<VirtualPet> getAllPets() {
        return pets.values();
    }

    public VirtualPet getPet(String name) {
        return pets.get(name);
    }

    public void addPet(VirtualPet pet) {
        pets.put(pet.getName(), pet);
    }

    public void removePet(String name) {
        pets.remove(name);
    }

    // Shelter actions
    public void feedAllPets() {
        for (VirtualPet pet : pets.values()) {
            pet.feed();
        }
    }

    public void waterAllPets() {
        for (VirtualPet pet : pets.values()) {
            pet.water();
        }
    }

    public void playWithPet(String name) {
        VirtualPet pet = pets.get(name);
        if (pet != null) {
            pet.play();
        }
    }

    public void walkAllDogs() {
        for (VirtualPet pet : pets.values()) {
            if (pet instanceof OrganicDog) {
                OrganicDog organicDog = (OrganicDog) pet;
                organicDog.walk();
            }
        }
    }

    public void oilAllPets() {
        for (VirtualPet pet : pets.values()) {
            if (pet instanceof Robotic) {
                Robotic roboticPet = (Robotic) pet;
                roboticPet.oil();
            }
        }
    }

    public void cleanAllCages() {
        for (VirtualPet pet : pets.values()) {
            if (pet instanceof OrganicDog) {
                OrganicDog organicDog = (OrganicDog) pet;
                organicDog.setWaste(0);
            }
        }
    }


    public void cleanLitterBox() {
        for (VirtualPet pet : pets.values()) {
            if (pet instanceof OrganicCat) {
                OrganicCat organicCat = (OrganicCat) pet; 
                organicCat.setWaste(0);
            }
        }
    }

    // Tick method to update all pets
    public void tick() {
        for (VirtualPet pet : pets.values()) {
            pet.tick();
        }
    }
}

