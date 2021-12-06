package join;

/**
 * @Description: TODO
 * @Author rqxiao
 * @date 2020/12/21 16:03
 */
public class JoinThread extends Thread {

    public JoinThread(String name){
        super(name);
    }

    @Override
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println(this.getName()+i);
        }
    }
    public static void main(String[] args) throws InterruptedException {

        JoinThread t=new JoinThread("子线程");
        t.start();
        //调用t线程的join方法，等待t线程执行完毕
        t.join();
        System.out.println("主线程");


    }

}