package thread;

public class Test2 implements Runnable {
    private Object lock;

    public Test2(Object lock){
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized(lock){
            System.out.println(Thread.currentThread().getName()
                    + " get lock.");
            lock.notifyAll();
            System.out.println(Thread.currentThread().getName()
                    + " release lock.");
        }
        synchronized(lock){
            System.out.println(Thread.currentThread().getName()
                    + " get lock.");
            System.out.println(Thread.currentThread().getName()
                    + " release lock.");
        }
    }

    public static void main(String[] args){
        Object lock = new Object();
        Thread t1 = new Thread(new Test1(lock), "t1");
        Thread t2 = new Thread(new Test2(lock), "t2");
        t1.start();
        t2.start();
    }
}