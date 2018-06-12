package stream;

import java.util.List;
import java.util.stream.Collectors;

public class peektest {


    public static void main(String[] args) {
        List<Developer> listDevs = TestSorting.getDevelopers();
        List<Developer> agelist=listDevs.stream().peek(e -> e.setAge(22)).peek((e)->System.out.println(e)).collect(Collectors.toList());
       /* for (Integer i:agelist) {
            System.out.println(i);

        }*/
       /* List<Developer> listDevs2 = TestSorting.getDevelopers();
        listDevs2.stream().forEach(System.out::println);*/

      /* for (Developer d:agelist)
       {
           System.out.println(d);

       }*/
    }
}
