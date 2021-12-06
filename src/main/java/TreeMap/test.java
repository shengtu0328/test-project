package TreeMap;

import java.util.TreeMap;

public class test {

    public static void main(String[] args) {

        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "a");
        treeMap.put(4, "d"); // treeMap: {1=a, 2=b, 3=c, 4=d}

        treeMap.put(2, "b");
        treeMap.put(3, "c");

        treeMap.remove(4); // treeMap: {1=a, 2=b, 3=c}
        int sizeOfTreeMap = treeMap.size(); // sizeOfTreeMap: 3
    }
}
