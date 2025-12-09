package pets_amok;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class VirtualPetShelterTest {
    @Test
    void testCleanAllCages() {
        VirtualPetShelter shelter = new VirtualPetShelter();

        OrganicDog dirtyDog = new OrganicDog("Dirty Dog", 10, 10, 10, 10, 10, 10);
        RoboticDog roboticDog = new RoboticDog("Robo Dog", 10, 10, 10, 10, 10, 10);

        shelter.adoptPet(dirtyDog.getName(), dirtyDog);
        shelter.adoptPet(roboticDog.getName(), roboticDog);

        shelter.cleanAllCages();

        assertEquals(0, dirtyDog.getWaste());
        assertEquals(10, roboticDog.getWaste());
    }

    @Test
    void testOilAllPets() {
        VirtualPetShelter shelter = new VirtualPetShelter();
        RoboticDog roboticDog = new RoboticDog("RoboDog", 10, 10, 10, 10, 10, 10);
        OrganicDog organicDog = new OrganicDog("OrgDog", 10, 10, 10, 10, 10, 10);

        shelter.adoptPet(roboticDog.getName(), roboticDog);
        shelter.adoptPet(organicDog.getName(), organicDog);

        shelter.oilAllPets();

        assertEquals(12, roboticDog.getOilLevel()); // Assuming you start with oilLevel 10 and increment by 2
        assertEquals(10, organicDog.getHunger()); // Ensure organic pet's attributes remain unchanged
    }

    @Test
    void testCleanLitterBox() {
        VirtualPetShelter shelter = new VirtualPetShelter();
        OrganicCat organicCat = new OrganicCat("OrgCat", 10, 10, 10, 10, 10, 10);
        RoboticCat roboticCat = new RoboticCat("RoboCat", 10, 10, 10, 10, 10, 10);

        shelter.adoptPet(organicCat.getName(), organicCat);
        shelter.adoptPet(roboticCat.getName(), roboticCat);

        shelter.cleanLitterBox();

        assertEquals(0, organicCat.getWaste());
        assertEquals(10, roboticCat.getWaste());
    }

    
}
