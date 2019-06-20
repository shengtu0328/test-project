package syntest;

/**
 * @program: test-project
 * @author: rqxiao
 * @create: 2018-12-20 17:04
 **/
public class SynObject31 implements Runnable{


    SynObject_3 SynObject_3;

    public SynObject31(SynObject_3 s33) {
        SynObject_3 =s33;
    }


    @Override
    public void run() {
        SynObject_3.method();


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
