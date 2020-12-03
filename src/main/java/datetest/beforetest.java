package datetest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: test-project
 * @author: rqxiao
 * @create: 2019-03-22 14:4811122aa33aavv11
 **/
public class beforetest {

    public static void main(String[] args) {


        String beginTime = "2018-08-28 14:42:32";
        String endTime = "2018-08-28 14:41:32";

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        try {
            Date date1 = format.parse(beginTime);
            Date date2 = format.parse(endTime);

            boolean before = date1.before(date2);

            System.out.println(before);

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
