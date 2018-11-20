package thread.sleeptest.app11_6;

public class Mbank{
    private static int sum=2000;
    public static void take(int k){

        int temp=sum;
        temp-=k;
        try {
            System.out.println(Thread.currentThread().getName()+"要睡觉了");
            Thread.sleep((long) (2000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"醒了");

        sum=temp;
        System.out.println(Thread.currentThread().getName()+"sum=" + sum);
    }
    public static void main(String[] args) {
        Customer c1=new Customer();
        Customer c2=new Customer();
        c1.start();
        c2.start();
    }
}