import java.io.File;

public class Display extends Garage {
    public void display() {
        boolean printed = false;
        int cnt = 1;
        for (slotsInfo slot : slots) {
            if (slot.getID() == -1) {
                printed = true;
                System.out.println("Slot number " + (cnt++) + ": " + "Length: " + slot.getLen() + "\t Width: " + slot.getWid());
            }
        }
        System.out.println("\n");
        if (!printed) {
            System.out.println("There is no available slots!");
        }
    }

    @Override
    public void setConfiguration() {

    }

    @Override
    public boolean setDimensionOfSlots(int choice, File in) {return false;}

    @Override
    public boolean changeSlots(double len, double wid, boolean config, int id) {
        return false;
    }

    @Override
    public boolean changeSlots(int id) {
        return false;
    }
}
