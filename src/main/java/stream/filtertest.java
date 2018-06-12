package stream;

import java.util.Arrays;
import java.util.List;

public class filtertest {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        long count = strings.stream().filter(string -> { return string.isEmpty();}).count();
        System.out.println(count);

/*

        String a ="abcb";
        a.re
        ;
        System.out.println(a.replace("b","z"));*/
    }
}
