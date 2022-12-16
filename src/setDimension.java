import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class setDimension extends Garage {
    @Override
    public boolean setDimensionOfSlots(int choice, File in) {
        if (choice == 1) {
            int Slots;
            try {
                Scanner myReader = new Scanner(in);
                Slots = myReader.nextInt();
                numOfSlots = Slots;
                for (int i = 0; i < numOfSlots; i++) {
                    double len, wid;
                    len = myReader.nextDouble();
                    wid = myReader.nextDouble();
                    slotsInfo slot=new slotsInfo(len,wid,-1);
                    slots.add(slot);
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        } else {
            Scanner cin = new Scanner(System.in);
            System.out.println("Enter number of slots:");
            int Slots = cin.nextInt();
            numOfSlots = Slots;
            for (int i = 0; i < Slots; i++) {
                double len, wid;
                System.out.println("Enter Length and Width of " + i + 1 + "'s Slot:");
                len = cin.nextDouble();
                wid = cin.nextDouble();
                slotsInfo slot=new slotsInfo(len,wid,-1);
                slots.add(slot);
            }
        }
        System.out.println("All Slots has been added");
        return true;
    }

    @Override
    public boolean changeSlots(double len, double wid, boolean config, int id) {
        return false;
    }

    @Override
    public boolean changeSlots(int id) {
        return false;
    }

    @Override
    public void display() {

    }

    @Override
    public void setConfiguration() {

    }



}
