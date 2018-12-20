package syntest;

/**
 * @program: test-project
 * @author: rqxiao
 * @create: 2018-12-20 17:38
 **/
public class SynClass2 implements Runnable {


    @Override
    public void run() {
        method();
    }


    public static  void method(){

        synchronized(SynClass2.class){
            System.out.println((Thread.currentThread().getName() + "获得了类锁"));
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println((Thread.currentThread().getName() + "获得了类锁运行结束"));
        }
    }

    public static void main(String[] args) {
        SynClass2 s1=new SynClass2();
        SynClass2 s2=new SynClass2();
        Thread t1= new Thread(s1);
        Thread t2= new Thread(s2);
        t1.start();
        t2.start();

    }
}
