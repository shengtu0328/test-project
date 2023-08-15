package stream;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: rqxiao
 * @Date: 2020-3-16 15:12
 * @Description:
 */
public class sortedtest {

    public static void main(String[] args) {

        List<Developer> result = new ArrayList<Developer>();
        result.add(new Developer("otto", new BigDecimal("1000"), 10));
        result.add(new Developer("", new BigDecimal("1200"), 65));
        result.add(new Developer("", new BigDecimal("1200"), 60));
        result.add(new Developer(null, new BigDecimal("1200"), 55));
        result.add(new Developer("zed", new BigDecimal("1200"), 60));

        result.add(new Developer("xrq", new BigDecimal("200"), 33));
        result.add(new Developer("xrq2", new BigDecimal("700"), 33));
        result.add(new Developer("bob", new BigDecimal("800"), 20));


        List<Developer> collect = result.stream().sorted(Comparator.comparing(Developer::getName)).collect(Collectors.toList());
        collect.stream().forEach(System.out::println);


//
//
//        List<Developer> collect = result.stream().sorted(Comparator.comparing(Developer::getSalary).thenComparing(Developer::getAge,Comparator.reverseOrder())).collect(Collectors.toList());
//        collect.stream().forEach(System.out::println);

    }
}
