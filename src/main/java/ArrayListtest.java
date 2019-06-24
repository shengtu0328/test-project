import java.util.ArrayList;
import java.util.List;

public class ArrayListtest {


    private int a;

    public static void main(String[] args) {
        List<Integer> l=new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);

        for (Integer i:l) {
            System.out.println(i);
        }
        System.out.println(l.getClass());

        System.out.println(11);

        System.out.println(22);

        System.out.println(33);
        ArrayListtest ArrayListtest = new ArrayListtest();
        ArrayListtest.a=333;

    }
}
