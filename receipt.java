import java.io.File;

public class receipt extends Garage {

    long calcParking(int ID) {
        Time t = new Time();
        long gap = t.calcTotalTime(ID);
        calcTotal(5*gap);
        return 5 * gap;
    }

    @Override
    public boolean setDimensionOfSlots(int choice, File in) {
        return false;
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
    public void display() {}

    @Override
    public void setConfiguration() {

    }

}
