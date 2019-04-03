package datetest;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dategettime {


    public static void main(String[] args) {

        SimpleDateFormat Format = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println(Format.format(new Date(new Date().getTime() + (long) 6 * (long) 30 * (long) 24 * (long) 60 * (long) 60 * (long) 1000)));

        System.out.println(Format.format(new Date(new Date().getTime() + (long)60*(long)60*(long)1000)));

    }
}
