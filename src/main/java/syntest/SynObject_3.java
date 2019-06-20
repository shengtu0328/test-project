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

    public synchronized void   method() {
        System.out.println((Thread.currentThread().getName() + "获得普通方法"));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println((Thread.currentThread().getName() + "普通方法结束"));
    }
}
