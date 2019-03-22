package stream;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: test-project
 * @author: rqxiao
 * @create: 2019-03-22 17:45
 **/
public class reduce {

    public static void main(String[] args) {


        List<Double> list= new ArrayList<>();
        list.add(3.2);
        list.add(3.3);
        list.add(3.3);


        Double reduce = list.stream().reduce(30.0, Double::sum);

        System.out.println(reduce);
    }
}
