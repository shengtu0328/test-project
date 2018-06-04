package stream;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestSorting {


    public static void main(String[] args) {

        List<Developer> listDevs = getDevelopers();

        System.out.println("Before Sort");
        for (Developer developer : listDevs) {
            System.out.println(developer);
        }

        System.out.println("After Sort");
        List<Developer> collect = listDevs.stream().sorted(Comparator.comparing(Developer::getAge)).collect(Collectors.toList());
        for (Developer developer : collect) {
            System.out.println(developer);
        }




/*
        listDevs.stream().sorted(Comparator.comparing(Developer::getAge));

      */  //sort by age
       /* Collections.sort(listDevs, new Comparator<Developer>() {
            @Override
            public int compare(Developer o1, Developer o2) {
            return o1.getAge() - o2.getAge();
             }}
         );*/


      /*  listDevs.stream().map();*/


/*
        listDevs.stream().filter((t)->t.getAge()>22)                        .forEach(u->System.out.println(u.getAge())  );;
*/

/*

        listDevs.stream().filter((t)->t.getAge()>22).collect(Collectors.toList());
*/

        /*listDevs.sort((o1,o2)-> o1.getSalary().subtract( o2.getSalary()).intValue());
        listDevs.forEach(System.out::println);*/

        /*System.out.println("After Sort");
        for (Developer developer : listDevs) {
            System.out.println(developer);
        }*/

    }

    private static List<Developer> getDevelopers() {

        List<Developer> result = new ArrayList<Developer>();

        result.add(new Developer("mkyong", new BigDecimal("70000"), 33));
        result.add(new Developer("alvin", new BigDecimal("80000"), 20));
        result.add(new Developer("jason", new BigDecimal("100000"), 10));
        result.add(new Developer("iris", new BigDecimal("170000"), 55));

        return result;

    }
}
