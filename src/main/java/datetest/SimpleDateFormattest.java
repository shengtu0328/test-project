package datetest;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @Author: rqxiao
 * @Date: 2019-8-8 10:42
 * @Description:
 */
public class SimpleDateFormattest {

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE, 1);

        System.out.println(c.getTime().getTime());


        System.out.println(c.getTime().getTime());


    }
}
