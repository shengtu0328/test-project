package lambda;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Auther: rqxiao
 * @Date: 2019-7-2 10:51
 * @Description:
 */
public class Java8Examples3 {


    public static void main(String[] args) {

        //3 apple, 2 banana, others 1
    List<Item> items = new ArrayList();

        items.add(new Item("1", 10, new BigDecimal("9.99")));
        items.add(new Item("1", 10, new BigDecimal("9.99")));
        items.add(new Item("1", 10, new BigDecimal("9.99")));
        items.add(new Item("2", 10, new BigDecimal("9.99")));
        items.add(new Item("2", 10, new BigDecimal("9.99")));
        items.add(new Item("2", 10, new BigDecimal("9.99")));
        items.add(new Item("3", 10, new BigDecimal("9.99")));
        items.add(new Item("3", 10, new BigDecimal("9.99")));
        items.add(new Item("4", 10, new BigDecimal("9.99")));
        items.add(new Item("4", 10, new BigDecimal("9.99")));
        items.add(new Item("8", 10, new BigDecimal("9.99")));





//    Map<String, Long> counting = items.stream().collect(
//            Collectors.groupingBy(Item::getName, Collectors.counting()));
//
//        System.out.println(counting);
//
//    Map<String, Integer> sum = items.stream().collect(
//            Collectors.groupingBy(Item::getName, Collectors.summingInt(Item::getId)));
//
//        System.out.println(sum);
//


//        Map<String, List<Item>> groupByPriceMap =
//                items.stream().collect(Collectors.groupingBy(Item::getName));

//
//        Map<String, List<Item>> groupByPriceMap2 =
//                items.stream().collect(Collectors.groupingBy(x->x.getName()+x.getId()));
//
//
////        Set<Map.Entry<String, List<Item>>> entries = ggroupByPriceMap2.entrySet();
//        groupByPriceMap2.entrySet().stream().forEach(x->System.out.println(x.getKey()+"--------"+x.getValue()));


        Map<String, List<Item>> collect = items.stream().collect(Collectors.groupingBy(x -> x.getName()));



    }


}
