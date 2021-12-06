package futuretest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureUsage {

    private ExecutorService executor
            = Executors.newSingleThreadExecutor();

    public Future<Integer> calculate(Integer input) {
        return executor.submit(() -> {
            System.out.println("Calculating..." + input);
            Thread.sleep(30000);
            return input * input;
        });
    }

    public static void main(String[] args) throws Exception {
        FutureUsage futureUsage = new FutureUsage();
        Future<Integer> futureOne = futureUsage.calculate(20);
        System.out.println("outside result: " + futureOne.get());

        while (!futureOne.isDone()) {
            System.out.println("Calculating...");
            System.out.println("inside result: " + futureOne.get());
            Thread.sleep(300);
        }
        Integer result = futureOne.get();
        System.out.println("final result: " + result);
    }
}
