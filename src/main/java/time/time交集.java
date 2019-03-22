package time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: test-project
 * @author: rqxiao
 * @create: 2019-03-22 13:22
 **/
public class time交集 {


    public static void main(String[] args) {
        getAlphalDate();
    }


    public static void getAlphalDate() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


// 标准时间
            Date d1 = sdf.parse("2017-05-02 00:00:00");
            Date d2 = sdf.parse("2017-05-04 00:00:00");
// 目标时间
            Date f1 = sdf.parse("2017-05-03 00:00:00");
            Date f2 = sdf.parse("2017-05-13 00:00:00");


            long min1 = Math.min(d1.getTime(), d2.getTime());// 开始时间
            long max1 = Math.max(d1.getTime(), d2.getTime());// 结束时间

            long min2 = Math.min(f1.getTime(), f2.getTime());// 开始时间
            long max2 = Math.max(f1.getTime(), f2.getTime());// 结束时间


// 具体算法如下
// 首先看是否有包含关系
// 一定有重叠部分
                long start = min2 >= min1 ? min2 : min1;
                long end = max1 >= max2 ? max2 : max1;
                System.out.println("包含的开始时间是：" + sdf.format(start) + "-结束时间是：" + sdf.format(end));


        } catch (ParseException e) {
            e.printStackTrace();
        }


    }

}
