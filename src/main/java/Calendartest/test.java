package Calendartest;

import java.util.Calendar;

/**
 * @Author: rqxiao
 * @Date: 2019-8-1 15:14
 * @Description:
 */
public class test {

    public static void main(String[] args) {



        Calendar cal = Calendar.getInstance();
        int day = cal.get(Calendar.DATE);
        int month = cal.get(Calendar.MONTH) + 1;
        int year = cal.get(Calendar.YEAR);

        System.out.println("日期: " + day);
        System.out.println("月份: " + month);
        System.out.println("年份: " + year);
    }

}
