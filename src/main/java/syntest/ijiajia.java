package syntest;

/**
 * @program: test-project
 * @author: rqxiao
 * @create: 2018-12-20 15:11
 **/
public class ijiajia {


    public static void main(String[] args) {
        int i1 = 1;
        int j1 = i1++;
        System.out.println("i1=" + i1); // 输出 i=2
        System.out.println("j1=" + j1); // 输出 j1=1

        int i2 = 1;
        int j2 = ++i2;

        System.out.println("i2=" + i2); // 输出 i=2
        System.out.println("j2=" + j2); // 输出 j2=2
    }
}
