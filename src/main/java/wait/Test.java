package wait;

public class Test {

    public static void main(String[] args) throws InterruptedException {

        Object lock = new Object();

        ThreadA a = new ThreadA(lock);
        a.setName("a");
        a.start();



        ThreadA b = new ThreadA(lock);
        b.setName("b");
        b.start();

        //NotifyThread notifyThread = new NotifyThread(lock);
        // notifyThread.start();

        SynNotifyMethodThread c = new SynNotifyMethodThread(lock);
        c.setName("c");
        c.start();


        SynNotifyMethodThread d = new SynNotifyMethodThread(lock);
        d.setName("d");
        d.start();
    }
}