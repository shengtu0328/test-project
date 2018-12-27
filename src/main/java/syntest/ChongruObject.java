package syntest;

/**
 * @program: test-project
 * @author: rqxiao
 * @create: 2018-12-27 16:58
 **/
public class ChongruObject {

    private int i=0;


    public synchronized void aa(){
        System.out.println("进了a");
        if(i==0) {
            bb();
        }
    }


    public synchronized void bb(){
        System.out.println("进了b");

        i++;
        aa();
    }
}
