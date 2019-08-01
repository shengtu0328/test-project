package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class filtertest {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

//        strings.add("333");

        List<String> stringList = strings.stream().filter(string -> "abc".equals(string)).collect(Collectors.toList());







        long count = strings.stream().filter(string -> { return string.isEmpty();}).count();
        System.out.println(count);

/*

        String a ="abcb";
        a.re
        ;
        System.out.println(a.replace("b","z"));*/
    }
}
