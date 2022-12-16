import java.util.Vector;
import java.util.Scanner;
import java.util.Date;

public class vehicle {
    private int id, modelYear;
    private String startTime, endTime;
    private Date startDate, endDate;
    private double len, wid;
    String modelName;
    static protected Vector<vehicle> vehicles = new Vector<vehicle>();

    public vehicle() {

    }
    public vehicle(String _modelName, int _id, int _modelYear, Double _len, Double _wid) {
        modelName = _modelName;
        modelYear = _modelYear;
        len = _len;
        wid = _wid;
        id = _id;
    }

    public vehicle(String _modelName, int _id, int _modelYear, Double _len, Double _wid, Date startDate1) {
        modelName = _modelName;
        modelYear = _modelYear;
        len = _len;
        wid = _wid;
        id = _id;
        startDate = startDate1;
    }


    public boolean setCarInfo() {
        if (vehicles.size() > 0)
            id = vehicles.lastElement().id + 1;
        else id = 1;
        String modelName;
        int modelYear;
        Double len, wid;
        System.out.println("Enter Model name of the car:");
        Scanner cin = new Scanner(System.in);
        modelName = cin.nextLine();
        System.out.println("Enter Model year of the car:");
        modelYear = cin.nextInt();
        System.out.println("Enter length of the car:");
        len = cin.nextDouble();
        System.out.println("Enter width of the car:");
        wid = cin.nextDouble();
        vehicle in = new vehicle(modelName, id, modelYear, len, wid);
        parkIn park1 = new parkIn();
        configuration con = new configuration();
        if (park1.changeSlots(in.len, in.wid, con.getConfig(), in.id)) {
            Time t = new Time();
            startDate = t.calcBegin();
            in = new vehicle(modelName, id, modelYear, len, wid, startDate);
            vehicles.add(in);
            System.out.println("Car ID: " + id + '\n');
            return true;
        } else {
            System.out.println("There is no position to park :(\n");
            return false;
        }
    }

    Date getStartDate() {
        return startDate;
    }

    Date getEndDate() {
        return startDate;
    }

    void setStartDate(Date s) {
        startDate = s;
    }

    void setEndDate(Date e) {
        endDate = e;
    }

    String getStartTime() {
        return startTime;
    }

    String getEndTime() {
        return endTime;
    }

    void setStartTime(String s) {
        startTime = s;
    }

    void setEndTime(String e) {
        endTime = e;
    }

    int getId(){
        return id;
    }




//    public boolean parkIn() {
//        Controller con = new Controller();
//        configuration config = new configuration();

//        setCarInfo(d1);
//        boolean o = config.getConfig();
//        if (!con.decreaseSlots(cars.lastElement().len, cars.lastElement().wid, o, cars.lastElement().id)) {
//            System.out.println("There is no Slot to park in");
//            return false;
//        }
//        return true;
//    }
//
//    long calcTime(int ID) {
//        long gap = 0;
//        for (int i = 0; i < cars.size(); ++i) {
//            if (cars.get(i).id == ID) {
//                long difference_In_Time = d2.getTime() - cars.get(i).d1.getTime();
//                long minDif = TimeUnit.MILLISECONDS.toMinutes(difference_In_Time) % 60;
//                long secDif = TimeUnit.MILLISECONDS.toSeconds(difference_In_Time) % 60;
//                long hourDif = TimeUnit.MILLISECONDS.toHours(difference_In_Time) % 24;
//                if (minDif > 0 || secDif > 0) hourDif++;
//                gap = hourDif;
//                cars.remove(i);
//                break;
//            }
//        }
//        return gap;
//    }
//
//    long calcParking(int ID) {
//        long gap = calcTime(ID);
//        Controller con = new Controller();
//        con.calcTotal(5 * gap);
//        return 5 * gap;
//    }
//
//    boolean parkOut() {
//        endTime = String.valueOf(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));
//        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
//        try {
//            d2 = sdf.parse(endTime);
//        } catch (ParseException e) {
//            throw new RuntimeException(e);
//        }
//        Scanner cin = new Scanner(System.in);
//        System.out.println("Enter id of car that will leave:");
//        int ID = cin.nextInt();
//        Controller con = new Controller();
//        if (!con.increaseSlot(ID)) {
//            System.out.println("There is no car with this ID!\n");
//        }
//        calcParking(ID);
//        return true;
//    }
}
