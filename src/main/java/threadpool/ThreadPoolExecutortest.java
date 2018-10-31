package threadpool;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutortest {


    public static void main(String[] args) throws InterruptedException {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(3, 6, 4, TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>(3));
        Runnable myRunnable = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                    System.out.println(Thread.currentThread().getName() + " run");
/*
                    System.out.println("此时的队列" + executor.getQueue().size());
*/

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };



        System.out.println("初始最大线程数" + executor.getMaximumPoolSize());
        System.out.println("初始核心线程数" + executor.getCorePoolSize());
        System.out.println("初始线程数" + executor.getPoolSize());
        System.out.println("初始队列任务数" + executor.getQueue().size());
        System.out.println("----------------------------------");

        executor.execute(myRunnable);
        executor.execute(myRunnable);
        executor.execute(myRunnable);
/*
        System.out.println("开3个核心线程数" + executor.getCorePoolSize());
*/
        System.out.println("开3个线程池数" + executor.getPoolSize());
        System.out.println("开3个队列任务数" + executor.getQueue().size());
        System.out.println("----------------------------------");

        executor.execute(myRunnable);
        executor.execute(myRunnable);
        executor.execute(myRunnable);
/*
        System.out.println("开6个核心线程数" + executor.getCorePoolSize());
*/
        System.out.println("开6个线程池数" + executor.getPoolSize());
        System.out.println("开6个队列任务数" + executor.getQueue().size());
        System.out.println("----------------------------------");


        executor.execute(myRunnable);
        executor.execute(myRunnable);
        executor.execute(myRunnable);
/*
        System.out.println("开9个核心线程数" + executor.getCorePoolSize());
*/
        System.out.println("开9个线程池数" + executor.getPoolSize());
        System.out.println("开9个队列任务数" + executor.getQueue().size());
        System.out.println("----------------------------------");



        executor.execute(myRunnable);
/*
        System.out.println("开10个核心线程数" + executor.getCorePoolSize());
*/
        System.out.println("开10个线程池数" + executor.getPoolSize());
        System.out.println("开10个队列任务数" + executor.getQueue().size());
        System.out.println("----------------------------------");

        executor.execute(myRunnable);
/*
        System.out.println("开11个核心线程数" + executor.getCorePoolSize());
*/
        System.out.println("开11个线程池数" + executor.getPoolSize());
        System.out.println("开11个队列任务数" + executor.getQueue().size());
        System.out.println("----------------------------------");


        executor.execute(myRunnable);
/*
        System.out.println("开12个核心线程数" + executor.getCorePoolSize());
*/
        System.out.println("开12个线程池数" + executor.getPoolSize());
        System.out.println("开12个队列任务数" + executor.getQueue().size());
        System.out.println("----------------------------------");

        System.out.println("main现场开始睡觉");

        Thread.sleep(8000);
        System.out.println("----8秒之后----");


        System.out.println("核心线程数" + executor.getCorePoolSize());
        System.out.println("线程池数" + executor.getPoolSize());
        System.out.println("队列任务数" + executor.getQueue().size());

    }









}
