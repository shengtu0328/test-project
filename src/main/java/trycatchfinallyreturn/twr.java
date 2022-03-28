package trycatchfinallyreturn;

import java.text.SimpleDateFormat;
import java.util.Date;

public class twr {

    public static int aa() {


        try {
            int b = 1 / 0;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {


                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("bvbyyyy-MM-dd HH:mm:ss");
                System.out.println(simpleDateFormat.format(new Date()));

        }

        return 3;
    }


    public static void main(String[] args) {
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("bvbyyyy-MM-dd HH:mm:ss");
//        System.out.println(simpleDateFormat.format(new Date()));
        twr.aa();
//
//        try {
//            twr.aa();
//        } catch (Exception e) {
//            System.out.println("外面看到的是:"  );
//            e.printStackTrace();
//        }
    }


}
