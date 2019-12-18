package yingyongzhichuandi;

/**
 * @Author: rqxiao
 * @Date: 2019-12-16 18:12
 * @Description:
 */
public class Cmower3 {

    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public static void main(String[] args) {
//        Cmower3 cmower = new Cmower3();
//        int age = 18;
//        cmower.sop(age);
//        System.out.println("main 中的 age " + age);
//
//
//






        Cmower3 cmower = new Cmower3();
        cmower.setName("沉默王二");

        Cmower3 old = cmower;
        old.sop(cmower);
        System.out.println("main 中的 cmower " + cmower.getName());

        System.out.println(old == cmower);

    }


    public void sop(Cmower3 cmower) {
        cmower.setName("沉默王三");
        System.out.println("sop 中的 cmower " + cmower.getName());
    }
}
