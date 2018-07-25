package optional;

import java.util.NoSuchElementException;
import java.util.Optional;

public class test {

    public static void main(String[] args) {
        //工厂方法创建Optional实例
        Optional<String> name = Optional.of("asdas");
        if (name.isPresent()) {
            //在Optional实例内调用get()返回已存在的值
            System.out.println(name.get());//输出optional
        }
        name.ifPresent((value) -> {
            System.out.println("The length of the value is: " + value.length());
        });



         //传入参数为null，抛出NullPointerException.
/*
        Optional<String> someNull = Optional.of(null);
*/

        //创建一个值为'null'的Optional
        Optional empty = Optional.ofNullable(null);


        //执行下面的代码会输出：No value present
        try {
            //在空的Optional实例上调用get()，抛出NoSuchElementException
            System.out.println(empty.get());
        } catch (NoSuchElementException ex) {
            System.out.println(ex.getMessage());
        }




//如果值不为null，orElse方法返回Optional实例的值。
//如果为null，返回传入的消息。
//输出：There is no value!
        System.out.println(empty.orElse("There is no value !"));
//输出：optional
        System.out.println(name.orElse("There is some value!"));







    }
}
