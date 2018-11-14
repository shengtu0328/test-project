package thread.safenotsafe;

public class Count implements Runnable{
    private int num = 50;//共有50张车票

    public void run() {
        for (int i = 0; i < 10; i++) {
            if (num > 0) {
                try {
                    //模拟网络延迟
                    Thread.sleep(100);
                    System.out.println(Thread.currentThread().getName() + "抢到了第"
                            + num + "号车票");
                    num=num-1;
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }
    }
    public static void main(String[] args) {
        //创建三个线程，模拟三个人抢票
        Runnable count= new Count();
        new Thread(count,"A").start();
        new Thread(count,"B").start();
        new Thread(count,"C").start();
    }

}
