package syntest;

/**
 * @program: test-project
 * @author: rqxiao
 * @create: 2018-12-21 09:40
 **/
public class SynObject_3 {
    public synchronized void synmethod() {
        System.out.println((Thread.currentThread().getName() + "获得了lock锁"));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println((Thread.currentThread().getName() + "获得了lock锁运行结束"));
    }

    public  void   method() {
        System.out.println((Thread.currentThread().getName() + "获得普通方法"));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println((Thread.currentThread().getName() + "普通方法结束"));
    }

    public static void main(String[] args) {
        SynObject_3 s333=new SynObject_3();
        SynObject31 s3=new SynObject31(s333);
        SynObject32 s33=new SynObject32(s333);

        Thread thread1= new Thread(s3);
        Thread thread2= new Thread(s33);
        thread1.start();
        thread2.start();

    }
}
