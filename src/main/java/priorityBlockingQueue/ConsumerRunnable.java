package priorityBlockingQueue;

import java.util.concurrent.PriorityBlockingQueue;

/**
 * @Description: TODO
 * @Author rqxiao
 * @date 2020/12/1512:59
 */
public class ConsumerRunnable implements Runnable{

    private PriorityBlockingQueue<Human> queue;
    public ConsumerRunnable(PriorityBlockingQueue<Human> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true){
            Human take = queue.poll();
            if (take == null){
                break;
            }
            System.out.println(take + " 办理业务.");
        }
    }
}
