package time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: test-project
 * @author: rqxiao
 * @create: 2019-03-22 13:22
 **/
public class betweenTime {


    public static void main(String[] args) {
        getAlphalDate();
    }


    public static void getAlphalDate() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


//            Date start = sdf.parse("2017-05-04 09:00:00");
//            Date end = sdf.parse("2017-05-04 09:45:00");
//
//            long between = (end.getTime() - start .getTime())/1000;
//
//            long min = between/60;



            Date d3 = sdf.parse("2019-07-23 13:00:00");

            long between3 = (System.currentTimeMillis() - d3 .getTime())/1000/60;

            System.out.println(between3);

//            System.out.println(min);
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }

}
