package syntest;

/**
 * @program: test-project
 * @author: rqxiao
 * @create: 2018-12-27 16:40
 **/
public class ChongruSyn implements Runnable{



    ChongruObject chongruObject=new ChongruObject();

    @Override
    public void run() {
        chongruObject.aa();



    }


    public static void main(String[] args) {
        ChongruSyn c1=new ChongruSyn();
        Thread t=new Thread(c1);
        t.start();
    }
}
