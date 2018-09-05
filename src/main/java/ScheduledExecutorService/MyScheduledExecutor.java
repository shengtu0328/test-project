package ScheduledExecutorService;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @program: test-project
 * @description: MyScheduledExecutor
 * @author: rqxiao
 * @create: 2018-09-05 15:03
 **/
class MyScheduledExecutor implements Runnable {

    private String jobName;

    MyScheduledExecutor() {

    }

    MyScheduledExecutor(String jobName) {
        this.jobName = jobName;
    }

    @Override
    public void run() {

        System.out.println(jobName + " is running");
    }

    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(10);

        long initialDelay = 1;
        long period = 1;
        // 从现在开始1秒钟之后，每隔1秒钟执行一次job1
        service.scheduleAtFixedRate(new MyScheduledExecutor("job1"), initialDelay, period, TimeUnit.SECONDS);

        // 从现在开始2秒钟之后，每隔2秒钟执行一次job2
        service.scheduleAtFixedRate(new MyScheduledExecutor("job2"), initialDelay, 10, TimeUnit.SECONDS);
    }
}