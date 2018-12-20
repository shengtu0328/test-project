package syntest;

/**
 * @program: test-project
 * @author: rqxiao
 * @create: 2018-12-20 17:38
 **/
public class SynClass implements Runnable {


    @Override
    public void run() {
        method();
    }


    public static synchronized void method(){
        System.out.println((Thread.currentThread().getName() + "获得了类锁"));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println((Thread.currentThread().getName() + "获得了类锁运行结束"));

    }

    public static void main(String[] args) {
        SynClass s1=new SynClass();
        SynClass s2=new SynClass();
        Thread t1= new Thread(s1);
        Thread t2= new Thread(s2);
        t1.start();
        t2.start();

    }
}
