import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Time extends vehicle {
    Date calcBegin() {
        setStartTime(String.valueOf(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"))));
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date d1;
        try {
            d1 = sdf.parse(getStartTime());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return d1;
    }

    Date calcEnd() {
        setEndTime(String.valueOf(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"))));
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date d2;
        try {
            d2 = sdf.parse(getEndTime());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return d2;
    }

    long calcTotalTime(int ID) {
        long gap = 0;
        for (int i = 0; i < vehicles.size(); ++i) {
            if (vehicles.get(i).getId() == ID) {
                vehicles.get(i).setEndDate (calcEnd());
                long difference_In_Time = vehicles.get(i).getEndDate().getTime() - vehicles.get(i).getStartDate().getTime();
                long minDif = TimeUnit.MILLISECONDS.toMinutes(difference_In_Time) % 60;
                long secDif = TimeUnit.MILLISECONDS.toSeconds(difference_In_Time) % 60;
                long hourDif = TimeUnit.MILLISECONDS.toHours(difference_In_Time) % 24;
                if (minDif > 0 || secDif > 0) hourDif++;
                gap = hourDif;
                vehicles.remove(i);
                break;
            }
        }
        return gap;
    }
}
