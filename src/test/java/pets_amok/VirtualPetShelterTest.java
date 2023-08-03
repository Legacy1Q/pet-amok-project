package pets_amok;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class VirtualPetShelterTest {
    @Test
    void testCleanAllCages() {
        VirtualPetShelter shelter = new VirtualPetShelter();

        OrganicDog dirtyDog = new OrganicDog("Dirty Dog", "A dog that needs a bath", 10, 10, 10, 10, 10, 10, 10);
        RoboticDog roboticDog = new RoboticDog("Robo Dog", "A dog that needs oil", 10, 10, 10, 10, 10, 10, 10);

        shelter.addPet(dirtyDog);
        shelter.addPet(roboticDog);

        shelter.cleanAllCages();

        assertEquals(0, dirtyDog.getWaste());
        assertEquals(10, roboticDog.getWaste());
    }

    @Test
    void testOilAllPets() {
        VirtualPetShelter shelter = new VirtualPetShelter();
        RoboticDog roboticDog = new RoboticDog("RoboDog", "Robotic Dog", 10, 10, 10, 10, 10, 10, 10);
        OrganicDog organicDog = new OrganicDog("OrgDog", "Organic Dog", 10, 10, 10, 10, 10, 10, 10);

        shelter.addPet(roboticDog);
        shelter.addPet(organicDog);

        shelter.oilAllPets();

        assertEquals(12, roboticDog.getOilLevel()); // Assuming you start with oilLevel 10 and increment by 2
        assertEquals(10, organicDog.getHunger()); // Ensure organic pet's attributes remain unchanged
    }

}
