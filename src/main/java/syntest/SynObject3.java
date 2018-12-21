package syntest;

/**
 * @program: test-project
 * @author: rqxiao
 * @create: 2018-12-20 17:04
 **/
public class SynObject3 implements Runnable{


    SynObject333 SynObject333;

    public SynObject3(SynObject333 s33) {
        SynObject333 =s33;
    }


    @Override
    public void run() {
        SynObject333.method();


    }
    public static void main(String[] args) {
        SynObject333 s333=new SynObject333();
        SynObject3 s3=new SynObject3(s333);
        SynObject33 s33=new SynObject33(s333);

        Thread thread1= new Thread(s3);
        Thread thread2= new Thread(s33);
        thread1.start();
        thread2.start();

    }
}
