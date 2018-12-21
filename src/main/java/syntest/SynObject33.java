package syntest;

/**
 * @program: test-project
 * @author: rqxiao
 * @create: 2018-12-20 17:04
 **/
public class SynObject33 implements Runnable{


    SynObject333 SynObject333;

    public SynObject33(SynObject333 s33) {
        SynObject333 =s33;
    }


    @Override
    public void run() {
        SynObject333.synmethod();


    }

}
