package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class test {

    public static void main(String[] args) {
        List<String> fatherlist=new LinkedList<>();
        List<String> childlist=new ArrayList<>();
        childlist.add("before add");
        fatherlist.addAll(childlist);
        childlist.add("after add");

        for (int i = 0; i <fatherlist.size() ; i++) {
            System.out.println(fatherlist.get(i));
        }
    }
}
