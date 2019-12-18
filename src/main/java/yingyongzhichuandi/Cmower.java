package yingyongzhichuandi;

/**
 * @Author: rqxiao
 * @Date: 2019-12-16 18:09
 * @Description:
 */
public class Cmower {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Cmower cmower = new Cmower();
        cmower.setName("111111");
        cmower.sop(cmower);
        System.out.println("main 中的 cmower " + cmower.getName());
    }

    public void sop(Cmower cmower) {
        cmower.setName("2222");
        System.out.println("sop 中的 cmower " + cmower.getName());
    }
}