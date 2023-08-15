package stream.findLast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("node", "java", "c++", "react", "javascript");
    list =new ArrayList<>();

        String result = list.stream().reduce((first, second) -> second).orElse(null);

        System.out.println(result);

    }

}
