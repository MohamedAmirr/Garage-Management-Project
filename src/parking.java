import java.io.File;

public abstract class parking extends Garage{

    abstract public boolean changeSlots(double len, double wid, boolean config, int id);

    abstract public boolean changeSlots(int id);

    @Override
    public boolean setDimensionOfSlots(int choice, File in) {
        return false;
    }

    @Override
    public void display() {

    }

    @Override
    public void setConfiguration() {

    }

}
