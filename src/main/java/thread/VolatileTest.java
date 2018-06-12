package thread;

public class VolatileTest {

    public volatile int num = 0;
    public void increase(){
        num++;
    }
    public static void main(String[] args) throws InterruptedException {
        VolatileTest volatileTest = new VolatileTest();
        for (int i=0; i<10; i++){
            new Thread(){
                @Override
                public void run(){
                    for (int j=0; j<1000; j++){
                        volatileTest.increase();
                    }
                }
            }.start();
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(volatileTest.num);
    }
}
