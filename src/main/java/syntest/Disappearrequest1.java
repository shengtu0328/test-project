package syntest;

/**
 * @program: test-project
 * @author: rqxiao
 * @create: 2018-12-20 13:20
 **/
public class Disappearrequest1 implements Runnable{


    int a=0;


    @Override
    public void run() {
        for (int i = 0; i < 150000; i++) {
            a++;
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Disappearrequest1 instance=new Disappearrequest1();

        Thread t1=new Thread(instance);
        Thread t2=new Thread(instance);
        t1.start();
        t2.start();

        t1.join();

        t2.join();


        System.out.println(instance.a);

    }


}
