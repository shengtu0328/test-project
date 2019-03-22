package optional;

import java.util.Optional;

/**
 * @program: test-project
 * @author: rqxiao
 * @create: 2019-03-22 17:22
 **/
public class optionget {


    public static void main(String[] args) {
        Optional<String> stringOptional = Optional.of("张三");
        System.out.println(stringOptional.get());

        Optional<String> vv= Optional.empty();
        System.out.println(vv.isPresent());




        Optional<String> aa= Optional.empty();
        System.out.println(aa.get());
    }
}
