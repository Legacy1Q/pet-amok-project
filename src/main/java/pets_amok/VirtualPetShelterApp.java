package pets_amok;

import java.util.Scanner;

public class VirtualPetShelterApp {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            VirtualPetShelter shelter = new VirtualPetShelter();

            // Add pets to the shelter (you can customize this)
            VirtualPet pet1 = new OrganicDog("Hank",  50, 50, 50, 50, 100, 100);
            VirtualPet pet2 = new RoboticDog("Drover",  50, 50, 50, 50, 100, 100);
            VirtualPet pet3 = new OrganicCat("Pete",  50, 50, 50, 50, 100, 100);
            VirtualPet pet4 = new RoboticCat("JT",  50, 50, 50, 50, 100, 100);


            shelter.adoptPet(pet1.getName(), pet1);
            shelter.adoptPet(pet2.getName(), pet2);
            shelter.adoptPet(pet3.getName(), pet3);
            shelter.adoptPet(pet4.getName(), pet4);

            System.out.println("Welcome to Big Al's Virtual Pet Shelter and Delicatessen!");

            while (true) {
                // Display status of all pets
                System.out.println("\nThis is the status of your pets:\n");
                System.out.println("Name\t|Hunger\t|Thirst\t|Waste\t|Boredom\t|Health");
                System.out.println("-------------------------------------");
                for (VirtualPet pet : shelter.getAllPets()) {
                    System.out.printf("%s\t|%d\t|%d\t|%d\t|%d\t|%d\n)",
                            pet.getName(), pet.getHunger(), pet.getThirst(), pet.getWaste(),
                            pet.getBoredom(), pet.getHealth());
                }

                // Display user options
                System.out.println("\nWhat would you like to do next?");
                System.out.println("1. Feed the pets");
                System.out.println("2. Water the pets");
                System.out.println("3. Play with a pet");
                System.out.println("4. Adopt a pet");
                System.out.println("5. Admit a pet");
                System.out.println("6. Oil all robotic pets");
                System.out.println("7. Clean dog cages");
                System.out.println("8. Clean cat litter box");
                System.out.println("9. Walk all dogs");
                System.out.println("0. Quit");
                System.out.print("Answer: ");
                int choice = input.nextInt();
                input.nextLine(); // Consume the newline character

                switch (choice) {
                    case 1:
                        shelter.feedAllPets();
                        System.out.println("\nYou feed all the pets.");
                        break;
                    case 2:
                        shelter.waterAllPets();
                        System.out.println("\nYou water all the pets.");
                        break;
                    case 3:
                        System.out.println("\nWhich pet would you like to play with?");
                        for (VirtualPet pet : shelter.getAllPets()) {
                            System.out.println(pet.getName());
                        }
                        System.out.print("Name: ");
                        String name = input.nextLine();
                        shelter.playWithPet(name);
                        System.out.println("\nYou play with " + name + ".");
                        break;
                    case 4:
                        System.out.println("\nWhich pet would you like to adopt?");
                        for (VirtualPet pet : shelter.getAllPets()) {
                            System.out.println(pet.getName());
                        }
                        System.out.print("Name: ");
                        name = input.nextLine();
                        shelter.admitPet(name);
                        System.out.println("\nYou adopt " + name + ".");
                        break;
                    case 5:
                        System.out.println("\nWhat is the name of the pet you would like to admit?");
                        name = input.nextLine();
                        VirtualPet pet = new VirtualPet(name, 50, 50, 50, 50, 100);
                        shelter.adoptPet(name,pet);
                        System.out.println("\nYou admit " + name + ".");
                        break;
                    case 6:
                        shelter.oilAllPets();
                        System.out.println("\nYou oil all robotic pets.");
                        break;
                    case 7:
                        System.out.println("\nYou clean all dog cages.");
                        break;
                    case 8:
                        System.out.println("\nYou clean the cat litter box.");
                        break;
                    case 9:
                        System.out.println("\nYou walk all the dogs.");
                        break;
                    case 0:
                        System.out.println("\nThank you for volunteering at Big Al's Virtual Pet Shelter and Delicatessen! Hope to see you again soon!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("\nSorry, I didn't understand that.");
                        break;
                }

                // Update pet needs with tick()
                shelter.tick();
            }
        }   
    }
}


