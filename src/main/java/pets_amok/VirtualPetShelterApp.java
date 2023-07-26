package pets_amok;

import java.util.Scanner;

public class VirtualPetShelterApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VirtualPetShelter shelter = new VirtualPetShelter();

        // Add pets to the shelter (you can customize this)
        VirtualPet pet1 = new VirtualPet("Hank", "loyal but dumb dog.", 50, 50, 50, 50, 50);
        VirtualPet pet2 = new VirtualPet("Drover", "a dog afraid of his own shadow.", 50, 50, 50, 50, 50);
        VirtualPet pet3 = new VirtualPet("Pete", "overly lazy cat.", 50, 50, 50, 50, 50);
        VirtualPet pet4 = new VirtualPet("JT", "ruthless and annoying rooster.", 50, 50, 50, 50, 50);

        shelter.addPet(pet1);
        shelter.addPet(pet2);
        shelter.addPet(pet3);
        shelter.addPet(pet4);

        System.out.println("Thank you for volunteering at Big Al's Virtual Pet Shelter and Delicatessen!");

        while (true) {
            // Display status of all pets
            System.out.println("\nThis is the status of your pets:\n");
            System.out.println("Name\t|Hunger\t|Thirst\t|Boredom");
            System.out.println("-------------------------------------");
            for (VirtualPet pet : shelter.getAllPets()) {
                System.out.printf("%s\t|%d\t|%d\t|%d%n", pet.getName(), pet.getHunger(), pet.getThirst(), pet.getBoredom());
            }

            // Display user options
            System.out.println("\nWhat would you like to do next?");
            System.out.println("1. Feed the pets");
            System.out.println("2. Water the pets");
            System.out.println("3. Play with a pet");
            System.out.println("4. Adopt a pet");
            System.out.println("5. Admit a pet");
            System.out.println("6. Quit");
            System.out.print("Answer: ");
            int choice = input.nextInt();
            input.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    shelter.feedAllPets();
                    System.out.println("\nYou feed the pets!");
                    break;
                case 2:
                    shelter.waterAllPets();
                    System.out.println("\nYou water the pets!");
                    break;
                case 3:
                    System.out.println("\nOk, so you'd like to play with a pet. Please choose one:\n");
                    for (VirtualPet pet : shelter.getAllPets()) {
                        System.out.printf("[%s] %s%n", pet.getName(), pet.getDescription());
                    }
                    String petName = input.nextLine();
                    shelter.playWithPet(petName);
                    System.out.println("\nOk, you play with " + petName + ".");
                    break;
                case 4:
                    System.out.println("\nGreat! You'd like to adopt a pet. Please choose one:\n");
                    String adoptPetName = input.nextLine();
                    VirtualPet adoptedPet = shelter.getPet(adoptPetName);
                    if (adoptedPet != null) {
                        shelter.removePet(adoptPetName);
                        System.out.println("Congratulations! You adopted " + adoptPetName + "!\n");
                    } else {
                        System.out.println("Sorry, we don't have a pet named " + adoptPetName + ".\n");
                    }
                    break;
                case 5:
                    System.out.println("\nThank you for admitting a pet. Please provide the following information:\n");
                    System.out.print("Name:");
                    String admitPetName = input.nextLine();
                    System.out.print("Description:");
                    String admitPetDescription = input.nextLine();
                    VirtualPet admitPet = new VirtualPet(admitPetName, admitPetDescription, 50, 50, 50, 50, 50);
                    shelter.addPet(admitPet);
                    System.out.println("Thank you for admitting " + admitPetName + "!\n");
                    break;
                case 6:
                    System.out.println("Thanks for volunteering! Goodbye!");
                    input.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            // Update pet needs with tick()
            shelter.tick();
        }
    }
}


