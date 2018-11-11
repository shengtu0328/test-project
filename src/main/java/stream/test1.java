package stream;

import java.util.stream.Stream;

public class test1 {

    public static void main(String[] args) {
        Stream<String> stream= Stream.of("I", "love", "you", "too");
        stream.filter(str -> str.length()==3)
                .forEach(str -> System.out.println(str));
    }
}
