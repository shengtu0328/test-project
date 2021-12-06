package priorityBlockingQueue;

import java.util.Comparator;

/**
 * @Description: TODO
 * @Author rqxiao
 * @date 2020/12/1512:58
 */
public class HumanComparator implements Comparator<Human> {
    @Override
    public int compare(Human o1, Human o2) {
        return o2.getManey() - o1.getManey();
    }
}
