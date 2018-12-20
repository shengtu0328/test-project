package syntest;

/**
 * @program: test-project
 * @author: rqxiao
 * @create: 2018-12-20 17:04
 **/
public class SynObject implements Runnable{


    Object lock1=new Object();
    Object lock2=new Object();


    @Override
    public void run() {


        synchronized (lock1){

            System.out.println((Thread.currentThread().getName() + "获得了lock1锁"));
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println((Thread.currentThread().getName() + "获得了lock1锁运行结束"));


        }

        synchronized (lock2){

            System.out.println((Thread.currentThread().getName() + "获得了lock2锁"));
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println((Thread.currentThread().getName() + "获得了lock2锁运行结束"));


        }

    }

    public static void main(String[] args) {
        SynObject s=new SynObject();
        Thread thread1= new Thread(s);
        Thread thread2= new Thread(s);
        thread1.start();
        thread2.start();

    }
}
