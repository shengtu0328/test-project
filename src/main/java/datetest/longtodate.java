package datetest;

import java.text.SimpleDateFormat;
import java.util.Date;

public class longtodate {

    public static void main(String[] args) {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Long[] values = new Long[]{1230854399999l };
//        for (Long value : values) {
//
//            System.out.println("value：" + simpleDateFormat.format(new Date(value)));
//        }


        Long value = 1514764800000L;
        System.out.println("value：" + simpleDateFormat.format(new Date(value)));

        Long origin = 1262390399999L;
        System.out.println("origin ：" + simpleDateFormat.format(new Date(origin)));

        Long pivotDistance =2160000000L;
        System.out.println("pivotDistance ：" + pivotDistance / (24 * 3600 * 1000) + "天");

//        Date date = new Date(1577836800000L);
//
//        pivotDistance

        Long weight = 100L;
        float score = (float) (weight * pivotDistance) / (pivotDistance + Math.abs(value - origin));
        System.out.println("score ：" + score);



    }
}
