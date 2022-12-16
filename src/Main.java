import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner in = new Scanner(System.in);
        System.out.println("Welcome!\n" + "Read number of slots from file (named as 'input') (choice 1) or terminal (choice 2):");
        int choice = in.nextInt();
        Garage garage = new setDimension();
        File input_file = null;
        if (choice == 1) {
            System.out.println("Enter name of input File:");
            String name_of_file = in.next();
            input_file = new File(name_of_file);
            garage.setDimensionOfSlots(choice, input_file);
        } else {
            garage.setDimensionOfSlots(choice, input_file);
        }
        configuration config = new configuration();
        config.setConfiguration();
        while (true) {
            System.out.println("Choose from the following numbers:\n\n" +
                    "1. Display available slots\n" +
                    "2. Car need to park-in\n" +
                    "3. Car need to park-out\n" +
                    "4. Display total income\n" +
                    "5. Exit\n");
            choice = in.nextInt();
            if (choice == 1) {
                Garage con = new Display();
                con.display();
            } else if (choice == 2) {
                vehicle vehicle1 = new vehicle();
                vehicle1.setCarInfo();
            } else if (choice == 3) {
                parking con = new parkOut();
                System.out.println("Please enter id:\n");
                int id = in.nextInt();
                if (!con.changeSlots(id)) {
                    System.out.println("This ID not available!\n");
                } else {
                    receipt r = new receipt();
                    System.out.println("Your receipt: " + r.calcParking(id));
                    System.out.println("Good Luck :(\n");
                }
            } else if (choice == 4) {
                System.out.println("Total income: " + garage.getTotalIncome());
            } else if (choice == 5) {
                break;
            }
        }
    }
}