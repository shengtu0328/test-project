package System.currentTimeMillis;

import stream.Developer;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;

public class test2 {
    public static void main(String[] args) {


        System.out.println(new Date());
        System.out.println(System.currentTimeMillis());
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis()-12*60*60*1000);
        System.out.println(System.currentTimeMillis() + " = " + dateformat.format(calendar.getTime()));


                 if(3>1*2)
                     System.out.println("a");
        Developer d=new Developer ();
        d.setName(null);
        Pattern p = Pattern.compile("aaaass");
        System.out.println(p.matcher(d.getName()).matches());
    }
}
