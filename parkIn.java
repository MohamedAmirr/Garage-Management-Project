import java.io.File;

public class parkIn extends parking {
    public boolean changeSlots(double len, double wid, boolean config, int id) {
        if (!config) {
            boolean br = false;
            for (int i = 0; i < slots.size(); ++i) {
                if (slots.get(i).getLen() > len && slots.get(i).getWid() > wid && slots.get(i).getID() == -1) {
                    slots.get(i).setID(id);
                    br = true;
                    break;
                }
            }
            if (br) numOfSlots--;
            else
                return false;
        } else {
            Double mnLen = 10000.0, mnWid = 1000.0;
            int pos = -1;
            for (int i = 0; i < slots.size(); ++i) {
                if ((slots.get(i).getLen() > len && slots.get(i).getWid() > wid) &&
                        ((slots.get(i).getLen() < mnLen && slots.get(i).getWid() <= mnWid) ||
                                (slots.get(i).getLen() <= mnLen && slots.get(i).getWid() < mnWid))
                        && slots.get(i).getID() == -1) {
                    mnLen = slots.get(i).getLen();
                    mnWid = slots.get(i).getWid();
                    pos = i;
                }
            }
            if (pos != -1) {
                numOfSlots--;
                slots.get(pos).setID(id);
            } else
                return false;
        }
        return true;
    }

    @Override
    public boolean changeSlots(int id) {
        return false;
    }


}
