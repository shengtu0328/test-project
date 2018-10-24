package stream;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class grouptest {
    public static void main(String[] args) {

        List<Developer> listDevs = TestSorting.getDevelopers();

/*
       Map<String, List<Developer>> collect = listDevs.stream().collect(Collectors.groupingBy(interface11 -> interface11.getName()));


        Map<String,Integer> collect2 = listDevs.stream().collect(Collectors.groupingBy(interface11 -> interface11.getName(),Collectors.summingInt(Developer::getAge)));


        Map<String, Map<BigDecimal, Integer>> collect3 = listDevs.stream().collect
                (Collectors.groupingBy(interface11 -> interface11.getName(),

                        Collectors.groupingBy(interface11 -> interface11.getSalary(), Collectors.summingInt(Developer::getAge))));


        collect.forEach((key, value) -> {
            System.out.println(key + ":" + value);
        });



        collect2.forEach((key, value) -> {
            System.out.println(key + ":" + value);
        });


        collect2.forEach((key, value) -> {
            System.out.println(key + ":" + value);
        });*/

/*

        Collections.sort(listDevs, new Comparator<Developer>() {

            @Override
            public int compare(Developer o1, Developer o2) {
                return o1.age - o2.age;
            }
        });
*/


        Optional<Developer> min = listDevs.stream().min(new Comparator<Developer>() {
            @Override
            public int compare(Developer o1, Developer o2) {
                return o1.getAge() - o2.getAge();
            }
        });


        System.out.println(min.get());
/*
        System.out.println(listDevs);
*/

    }
}
