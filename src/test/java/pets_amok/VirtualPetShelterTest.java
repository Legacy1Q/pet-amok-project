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

}
