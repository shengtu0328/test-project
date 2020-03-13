package datetest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: rqxiao
 * @Date: 2020-3-13 14:53
 * @Description:
 */
public class DayDifference {


    public static void main(String[] args) throws ParseException {



        //设置转换的日期格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        //开始时间
        Date startDate = sdf.parse("2019-12-24");
        //结束时间
        Date endDate = sdf.parse("2020-03-13");

        //得到相差的天数 betweenDate
        long betweenDate = (endDate.getTime() - startDate.getTime())/(60*60*24*1000);

        //打印控制台相差的天数
        System.out.println(betweenDate);

    }
}
