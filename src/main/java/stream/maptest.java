package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class maptest {

    public static void main(String[] args) {
        List<Developer> listDevs = TestSorting.getDevelopers();

        List<Integer> agelist=listDevs.stream().map( i ->i.getAge()).collect(Collectors.toList());;
        for (Integer i:agelist) {
            System.out.println(i);

        }
        for(Developer d:listDevs)
        {
            System.out.println(d);

        }


        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
// 获取对应的平方数
        List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());








    }
}
