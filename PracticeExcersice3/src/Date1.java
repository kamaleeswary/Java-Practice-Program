import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Date1 extends Date {
    public static void main(String args[]) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_WEEK,calendar.getFirstDayOfWeek());
        Date time=calendar.getTime();
        SimpleDateFormat simpleDateformat1 = new SimpleDateFormat("EEEE dd.MM.yyyy");
        System.out.println("First Day of week "+simpleDateformat1.format(time));

        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(Calendar.DAY_OF_WEEK,calendar1.getFirstDayOfWeek()+6);
        Date time1=calendar1.getTime();
        System.out.println("Last Day of Week "+simpleDateformat1.format(time1));





    }
}
