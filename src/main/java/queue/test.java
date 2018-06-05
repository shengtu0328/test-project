package queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class test {

    public static void main(String[] args) {
        BlockingQueue<String> q = new LinkedBlockingQueue<String>();
        q.offer("a");
        q.offer("b");
        q.offer("c");
        q.offer("d");
        q.offer("e");
        q.add("f");

        for (String s:q) {
            System.out.println(s);

        }
    }
}
