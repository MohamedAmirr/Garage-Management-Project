public class slotsInfo {
    private Double lens, wids;
    private int id;

    slotsInfo(Double len, Double wid, int _id) {
        lens = len;
        wids = wid;
        id = _id;
    }

    int getID() {
        return id;
    }

    void setID(int _id) {
        id = _id;
    }

    Double getLen() {
        return lens;
    }

    void setLen(Double _lens) {
        lens = _lens;
    }

    Double getWid() {
        return wids;
    }

    void setWid(Double _wid) {
        wids = _wid;
    }
}