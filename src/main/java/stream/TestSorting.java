package stream;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

       Long i1=1529633489440l;
        Long i2=1l;
        int c= (int) (i1-i2);
//        listDevs.stream().filter((t)->t.getAge()>20).limit(2).map(developer -> developer.getName()).forEach(System.out::println);
//

        Developer d=new Developer();
       String    ss;
      StringBuilder s=new StringBuilder("321");
        Stream<String> stringStream = listDevs.stream().filter((t) -> t.getAge() > 20).limit(1).map(developer -> {
                    System.out.println("map操作中的name" + developer.getName());
                    d.setName(developer.getName());
                    return developer.getName();
                }
        );
//        System.out.println("获取到的名字"+stringStream.findFirst().ifPresent(x->ss=x));





//    .forEach(u->System.out.println("年龄大于22的"+u.getAge())  );;


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

    public static List<Developer> getDevelopers() {

        List<Developer> result = new ArrayList<Developer>();
        result.add(new Developer("mkyong", new BigDecimal("20000"), 33));
        result.add(new Developer("mkyong2", new BigDecimal("70000"), 33));
        result.add(new Developer("alvin", new BigDecimal("80000"), 20));
        result.add(new Developer("jason", new BigDecimal("100000"), 10));
        result.add(new Developer("iris", new BigDecimal("170000"), 55));
        result.add(new Developer("iris", new BigDecimal("170000"), 20));

        return result;

    }
}
