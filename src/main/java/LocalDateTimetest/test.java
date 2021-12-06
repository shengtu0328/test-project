package LocalDateTimetest;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @Description: TODO
 * @Author rqxiao
 * @date 2021/2/21 10:33
 */
public class test {

    public static void main(String[] args) {
//        System.out.println(LocalDateTime.now());
//        System.out.println(new Date());

//        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        String localTime = df.format(LocalDateTime.now());
//        LocalDateTime ldt = LocalDateTime.parse("2018-01-12 17:07:05",df);
//        System.out.println("LocalDateTime转成String类型的时间："+localTime);
//        System.out.println("String类型的时间转成LocalDateTime："+ldt);


        LocalDateTime aa = LocalDateTime.parse("2018-01-01 00:00:00",DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        
        
        
        
        

    }
}
