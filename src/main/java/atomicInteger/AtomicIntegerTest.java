package atomicInteger;


import java.util.concurrent.atomic.AtomicInteger;



public class AtomicIntegerTest {

    public static AtomicInteger count = new AtomicInteger(569);

    public static void increase() {
        count.incrementAndGet();
    }

    public static void main(String[] args) {
        increase();

        System.out.println(count);
    }
}
