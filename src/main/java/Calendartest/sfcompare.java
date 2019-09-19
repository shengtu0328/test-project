package Calendartest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: rqxiao
 * @Date: 2019-8-1 15:33
 * @Description:
 */
public class sfcompare {


    public static void main(String[] args) throws ParseException {

        String startString = "2019-07-31 22:00:00";
        String endString   = "2019-08-01 16:44:00";


        Date startDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(startString);
        Date endDate = new SimpleDateFormat(  "yyyy-MM-dd HH:mm:ss").parse(endString);

        new Date();
//        Long minutes = (endDate.getTime() - startDate.getTime()) / (1000*3600*24);
//        System.out.println(minutes);
//
//        Long hours = (endDate.getTime() - startDate.getTime()) / (1000 * 3600);
//        System.out.println(hours);
//
//
        Long minutes = (endDate.getTime() -System.currentTimeMillis())/ (1000 * 60);
        System.out.println(minutes);


    }
}
