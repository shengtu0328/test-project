package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class linkendlisttest {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        Iterator iterator = list.iterator();
        iterator.next();
        System.out.println(list.get(0));
        System.out.println(list.get(1));

    }
}
