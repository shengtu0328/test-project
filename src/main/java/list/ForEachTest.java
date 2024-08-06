package list;

import java.util.ArrayList;
import java.util.List;

public class ForEachTest {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(100);

        list.add(3);
        for (int i : list) {
            System.out.println(i);
        }

    }
}
