package GregorianCalendartest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @program: test-project
 * @author: rqxiao
 * @create: 2019-03-22 13:47
 **/
public class test {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


        Date d = sf.parse("2019-03-31 16:43:00");

        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(d);
        gc.add(2, 1);//2代表月份，1代表在当前的日期添加一个月
        gc.set(gc.get(Calendar.YEAR), gc.get(Calendar.MONTH), gc.get(Calendar.DATE));
        String timeString = sf.format(gc.getTime());
        System.out.println(timeString);
    }
}
