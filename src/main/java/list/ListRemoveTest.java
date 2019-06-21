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
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(4);
//        for (int i=0; i<list.size(); i++) {
//            if (list.get(i) == 3) {
//                list.remove(i);
//            }
//        }
//        System.out.println(list);


        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) == 3) {
                list.remove(i);
            }
        }
        System.out.println(list);

    }
}
