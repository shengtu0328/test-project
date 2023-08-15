package futuretest;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class TaskWithResult implements Callable<String>
{

    public String call() throws Exception {
        // TODO Auto-generated method stub
        Thread.sleep(3000);
        return "OK";
    }

}
public class CallableDemo {

    /**
     * @param args
     * @throws Exception
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException, Exception {
        // TODO Auto-generated method stub
        ExecutorService exec=Executors.newCachedThreadPool();
        Future<String> st=exec.submit(new TaskWithResult());

        /*同步结果，而且设置超时时间*/

        System.out.println("11111");
        Thread.sleep(10000);
        System.out.println(st.get());
        System.out.println("222222");
        System.out.println("over");


    }

}