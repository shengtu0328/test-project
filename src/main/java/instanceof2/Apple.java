package instanceof2;

/**
 * @Auther: rqxiao
 * @Date: 2019-7-15 13:08
 * @Description:
 */
public class Apple implements Fruit
{
    private String a;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public static void main(String[] args) {



        Apple a= new Apple();
        System.out.println(a instanceof Apple);
        System.out.println(a instanceof Fruit);
        Banana b=new Banana();
        System.out.println(b instanceof Apple);
        System.out.println(b instanceof Fruit);





    }
}
