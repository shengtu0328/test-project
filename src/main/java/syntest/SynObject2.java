package syntest;

/**
 * @program: test-project
 * @author: rqxiao
 * @create: 2018-12-20 17:04
 **/
public class SynObject2 implements Runnable{



    @Override
    public synchronized void run() {



            System.out.println((Thread.currentThread().getName() + "获得了lock锁"));
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println((Thread.currentThread().getName() + "获得了lock锁运行结束"));




    }

    public static void main(String[] args) {
        SynObject2 s=new SynObject2();
        Thread thread1= new Thread(s);
        Thread thread2= new Thread(s);
        thread1.start();
        thread2.start();

    }
}
