package thread.sleeptest;

public class sleeptest {

    public static void main(String[] args) {


        new Thread(new Runnable(){

            @Override
            public void run() {
                System.out.println("进入aaa");

                try {
                    System.out.println("开始睡觉");

                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("aaa");
            }
        }).start();

        new Thread(new Runnable(){

            @Override
            public void run() {
                System.out.println("bb");
            }
        }).start();

        new Thread(new Runnable(){

            @Override
            public void run() {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("cc");
            }
        }).start();
    }
}
