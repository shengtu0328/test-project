package stream;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class grouptest {
    public static void main(String[] args) {

        List<Developer> listDevs = TestSorting.getDevelopers();


       Map<String, List<Developer>> collect = listDevs.stream().collect(Collectors.groupingBy(o -> o.getName()));


        Map<String,Integer> collect2 = listDevs.stream().collect(Collectors.groupingBy(o -> o.getName(),Collectors.summingInt(Developer::getAge)));


        Map<String, Map<BigDecimal, Integer>> collect3 = listDevs.stream().collect
                (Collectors.groupingBy(o -> o.getName(),

                        Collectors.groupingBy(o -> o.getSalary(), Collectors.summingInt(Developer::getAge))));


        collect.forEach((key, value) -> {
            System.out.println(key + ":" + value);
        });



        collect2.forEach((key, value) -> {
            System.out.println(key + ":" + value);
        });


        collect2.forEach((key, value) -> {
            System.out.println(key + ":" + value);
        });
    }
}
