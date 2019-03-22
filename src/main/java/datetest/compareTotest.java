package datetest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: test-project
 * @author: rqxiao
 * @create: 2019-03-22 14:44
 **/
public class compareTotest {


    public static void main(String[] args) {



        String beginTime = "2017-11-28 14:42:32";
        String endTime = "2018-07-29 12:26:32";

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        try {
            Date date1 = format.parse(beginTime);
            Date date2 = format.parse(endTime);

            int compareTo = date1.compareTo(date2);

            System.out.println(compareTo);

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
