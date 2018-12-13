package thread.Sync;

/**
 * @program: test-project
 * @author: rqxiao
 * @create: 2018-12-13 16:58
 **/
public class Sync {
}

class MyThread extends Thread {
    private Sync sync;

    public MyThread(Sync sync) {
        this.sync = sync;
    }


    public void run() {
        System.out.println("锁前");
        synchronized (sync) {
            System.out.println("test开始..");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("test结束..");
        }
        System.out.println("锁后");

    }

    public static void main(String[] args) {
        Sync sync = new Sync();

        for (int i = 0; i < 3; i++) {
            Thread thread = new MyThread(sync);
            thread.start();
        }
    }
}




