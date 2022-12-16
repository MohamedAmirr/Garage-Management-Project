import java.io.File;

public class parkOut extends parking {
    @Override
    public boolean changeSlots(int id) {
        boolean ch=false;
        for (int i = 0; i < slots.size(); ++i) {
            if (slots.get(i).getID() == id) {
                slots.get(i).setID(-1);
                ch=true;
            }
        }
        return ch;
    }

    @Override
    public boolean setDimensionOfSlots(int choice, File in) {return false;}

    @Override
    public void display() {}

    @Override
    public void setConfiguration() {

    }

    @Override
    public boolean changeSlots(double len, double wid, boolean config, int id) {return false;}

}
