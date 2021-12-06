package finaltest;

/**
 * @Description: TODO
 * @Author rqxiao
 * @date 2021/3/26 14:44
 */
public class Animals {

    private String name;


    private String a;

    public void eat() {
        System.out.println("animals eat");
    }

    public void sleep() {
        System.out.println("animals sleep");
    }

    public void setA(String a) {
        this.a = a;
    }


    public static void main(String[] args) {

        String name = "xrq";
        name="123";
        String finalName = name;
        Animals dog = new Animals() {

            @Override
            public void eat() {
                String ss= finalName;

                System.out.println("dog eat");
            }

            @Override
            public void sleep() {
                System.out.println("dog sleep");
            }

            @Override
            public void setA(String a) {
                super.setA(a);
            }

            public void run(String aa) {
                System.out.println("dog run");
            }
        };

        dog.eat();
        dog.sleep();

    }
}
