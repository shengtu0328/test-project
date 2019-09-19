package stream;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: rqxiao
 * @Date: 2019-8-1 14:37
 * @Description:
 */
public class filterandforeach {

    public static void main(String[] args) {

        List<Developer> result = new ArrayList<Developer>();
        result.add(new Developer("xrq", new BigDecimal("200"), 33));
        result.add(new Developer("xrq2", new BigDecimal("700"), 33));
        result.add(new Developer("bob", new BigDecimal("800"), 20));
        result.add(new Developer("otto", new BigDecimal("1000"), 10));
        result.add(new Developer("zed", new BigDecimal("1000"), 55));

        List<Developer> list = result.stream().filter(developer -> developer.getName().contains("xrq")).collect(Collectors.toList());

       result.stream().forEach(developer -> developer.setName("xxxxxx"));

    }
}
