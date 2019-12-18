package yingyongzhichuandi;

/**
 * @Author: rqxiao
 * @Date: 2019-12-16 18:07
 * @Description:
 */
public class Cmower2 {
    public static void main(String[] args) {
        Cmower2 cmower = new Cmower2();
        int age = 18;
        cmower.sop(age);
        System.out.println("main 中的 age " + age);
    }

    public void sop(int age) {
        age = 28;
        System.out.println("sop 中的 age " + age);
    }
}
