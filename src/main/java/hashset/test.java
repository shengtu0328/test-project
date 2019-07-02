package hashset;

import java.util.HashSet;

/**
 * @Auther: rqxiao
 * @Date: 2019-6-28 14:41
 * @Description:
 */
public class test
{
    public static void main(String[] args) {
        HashSet hashset= new HashSet();
        hashset.add("a");
        hashset.add("b");
        hashset.add("c");

        hashset.add("b");
        hashset.add("b");
        hashset.add("b");
        System.out.println(hashset.contains("a"));
        System.out.println(hashset.contains("as"));

        hashset.forEach(x->System.out.println(x));

    }
}
