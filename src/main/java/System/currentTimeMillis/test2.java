package System.currentTimeMillis;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class test2 {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis()-12*60*60*1000);
        System.out.println(System.currentTimeMillis() + " = " + dateformat.format(calendar.getTime()));


                 if(3>1*2)
                     System.out.println("a");
    }
}
