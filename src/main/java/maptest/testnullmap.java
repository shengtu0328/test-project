package maptest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class testnullmap {


    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2,3,4,5,6,7,8));

        List<String> collect = list.stream().map(x -> {


            if (x % 2 == 0) {
                return "偶数：" + x;

            } else {
                return null;
            }


        }).collect(Collectors.toList());

        System.out.println(collect);
    }
}
