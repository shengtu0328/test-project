package System.currentTimeMillis;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class test {

    public static void main(String[] args) {


        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            long time = dateformat.parse("2018-08-13 13:44:17").getTime();
            System.out.println(time);


        } catch (ParseException e) {
            e.printStackTrace();
        }


    }

}
