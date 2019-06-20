package syntest;

/**
 * @program: test-project
 * @author: rqxiao
 * @create: 2018-12-20 17:04
 **/
public class SynObject32 implements Runnable{


    SynObject_3 SynObject_3;

    public SynObject32(SynObject_3 s33) {
        SynObject_3 =s33;
    }


    @Override
    public void run() {
        SynObject_3.synmethod();


    }

}
