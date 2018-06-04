package threadpool;



import com.sun.corba.se.spi.orbutil.threadpool.ThreadPool;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class test {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor=new ThreadPoolExecutor(1000,1000,1000, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(5));

        for (int i = 0; i < 1000; i++) {
            threadPoolExecutor.execute(new Runnable() {
                public void run() {
                    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
                    System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
                }
            });

        }




    }
}
