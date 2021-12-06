package list;

import java.util.ArrayList;
import java.util.List;

public class ListRemoveTest {

    public static void main(String[] args) {
//        int i3=3>>1;
//        int i1=1>>1;
//
//        int i0=0>>1;
//
//int  [] aa= new int []{3};
//        Class<? extends int[]> c = aa.getClass();
//        System.out.println(i3);
//        System.out.println(i1);
//        System.out.println(i0);


        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(8);
        list.add(9);
        list.add(9);
        list.add(4);
        list.add(3);
//        for (int i=0; i<list.size(); i++) {
//            if (list.get(i) == 3) {
//                list.remove(i);
//            }
//        }
//        System.out.println(list);


//        for (int i = list.size() - 1; i >= 0; i--) {
//            if (list.get(i) == 3) {
//                list.remove(i);
//            }
//        }
        System.out.println(list);


        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(44);
        list2.add(55);
        list2.add(66);
        list2.add(77);
        list2.add(22);
        list2.add(11);
        list.addAll(list2);
        System.out.println(list);


    }
}
