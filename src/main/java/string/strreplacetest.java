package string;

/**
 * @program: test-project
 * @author: rqxiao
 * @create: 2019-02-22 14:50
 **/
public class strreplacetest {

    public static void main(String args[]) {
        String Str = new String("hello");

        System.out.print("返回值 :" );
        System.out.println(Str.replace('o', 'T'));
        System.out.println(Str);

        System.out.print("返回值 :" );
        System.out.println(Str.replace('l', 'D'));
        System.out.println(Str);

    }
}
