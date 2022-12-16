import java.io.File;
import java.util.*;

abstract public class Garage {
    static protected boolean config;//true when best slot, false when first slot
    static protected int numOfSlots = 0, totalIncome = 0;

    static protected Vector<slotsInfo>slots=new Vector<slotsInfo>();


    abstract public boolean setDimensionOfSlots(int choice, File in);

    abstract public boolean changeSlots(double len, double wid, boolean config, int id);

    abstract public boolean changeSlots(int id);

    abstract public void display();

    abstract public void setConfiguration();

    public void calcTotal(long sum) {
        totalIncome += sum;
    }

    public int getTotalIncome() {
        return totalIncome;
    }


};
