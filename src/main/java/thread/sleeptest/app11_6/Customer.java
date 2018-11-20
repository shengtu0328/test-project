package thread.sleeptest.app11_6;

public  class Customer extends Thread{
    public void run(){
        for(int i=1;i<=4;i++)
            Mbank.take(100);
    }
}