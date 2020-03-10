package Calendartest;

import java.util.Calendar;
import java.util.Date;

/**
 * @Author: rqxiao
 * @Date: 2020-3-10 17:08
 * @Description:
 */
public class test2 {

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
//方法 二
        System.out.println(Calendar.getInstance().getTimeInMillis());
//方法 三
        System.out.println(new Date().getTime());
    }
}
