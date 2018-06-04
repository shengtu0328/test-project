package timestampstring;

import java.sql.Timestamp;

public class test {


    public static void main(String[] args) {
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        String tsStr = "2011-05-09";
         tsStr =tsStr+" 00:00:00";

        try {
            ts = Timestamp.valueOf(tsStr);
            System.out.println(ts);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
