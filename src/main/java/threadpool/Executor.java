package threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 1000; i++) {
            executorService.submit(new Thread(new Runnable() {

                @Override

                public void run() {

                    System.out.println("2312");

                }

            }));

        }

    }
}
