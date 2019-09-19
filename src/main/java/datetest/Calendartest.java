package datetest;

import java.util.Calendar;
import java.util.Date;

/**
 * @Author: rqxiao
 * @Date: 2019-8-8 10:52
 * @Description:
 */
public class Calendartest {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.set(Calendar.HOUR_OF_DAY, 24);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        Date start = calendar.getTime();
        long time1 = start.getTime();


        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(new Date());
        calendar2.set(Calendar.HOUR_OF_DAY, 11);
        calendar2.set(Calendar.MINUTE, 0);
        calendar2.set(Calendar.SECOND, 0);
        Date end = calendar2.getTime();
        long time2 = end.getTime();

        System.out.println((System.currentTimeMillis() - time2)/1000);


        System.out.println(start);

    }
}
