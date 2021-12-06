package supplier_test;

public class Apple {

    private static String type;


    private String name;

    private Integer price;

    public Apple() {
    }


    public Apple(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public static void main(String[] args) {
        //实质代码:    test t1 = (string) -> new Person(string);
        //实质代码:    Person p = t1.run("张三");

        Interface1 t1 = (string,integer) -> new Apple(string,integer);
        Apple bigApple = t1.run("大苹果", 33);
        Interface1 t2 = Apple::new;
        Apple smallApple = t2.run("小苹果", 111);
    }








    public static String getType() {
        return type;
    }

    public  String getType1() {
        return type;
    }
    public static String staitcGetType1() {
        return type;
    }



    public static String getType3(Integer integer) {
        return type;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
