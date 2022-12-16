import java.io.File;
import java.util.Scanner;

public class configuration extends Garage {
    public void setConfiguration() {
        Scanner cin = new Scanner(System.in);
        int con = 0;
        do {
            System.out.println("Choose Configuration: ('1' if need by Best slot, '0' if need by First slot)");
            con = cin.nextInt();
            if (con != 0 && con != 1) {
                System.out.println("choice that entered is wrong!");
            }
        } while (con != 0 && con != 1);
        if (con == 1) config = true;
        if (con == 0) config = false;
    }
    public boolean getConfig()  {
        return config;
    }

    @Override
    public boolean setDimensionOfSlots(int choice, File in) {
        return false;
    }

    @Override
    public void display() {

    }

    @Override
    public boolean changeSlots(double len, double wid, boolean config, int id) {
        return false;
    }

    @Override
    public boolean changeSlots(int id) {
        return false;
    }
}
