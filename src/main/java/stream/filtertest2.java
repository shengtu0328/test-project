package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class filtertest2 {

    public static void main(String[] args) {
        List<Integer> l= new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        l.add(1);

        List<Integer> collect = l.stream().filter(s -> s == 1).collect(Collectors.toList());
        for (int i = 0; i <l.size() ; i++) {
            System.out.println(l.get(i));
        }

        for (int i = 0; i <collect.size() ; i++) {
            System.out.println(collect.get(i));
        }
    }
}
