package lambdamaohaotest;


import java.math.BigDecimal;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @Auther: rqxiao
 * @Date: 2019-7-2 10:50
 * @Description:
 */
public class Banana {

    private String name;
    private int id;
    private BigDecimal price;

//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public BigDecimal getPrice() {
//        return price;
//    }
//
//    public void setPrice(BigDecimal price) {
//        this.price = price;
//    }

    public Banana(String name, int id, BigDecimal price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public Banana() {
    }

    public static Banana ceshia( int id, BigDecimal price) {

        return new Banana(null,id,price);
    }

    public static Banana ceshia2(String name, int id) {

        return new Banana(name,id,null);

    }
    public String  getResult2() {
        return "2131231231";
    }


    public static String testC(String a, String b) {
        return a + b;
    }


    public static void main(String[] args) {
//        List<Item2> list = new ArrayList();
//        Item2 item2 = new Item2("1", 10, new BigDecimal("9.99"));
//        Item2 result = item2.getResult("1", 10, new BigDecimal("9.99"));
//        item2.getResult2();
//        list.add(item2);
////        list.add(new Item2("1", 10, new BigDecimal("9.99")));
////        list.add(new Item2("1", 10, new BigDecimal("9.99")));
////        list.add(new Item2("1", 10, new BigDecimal("9.99")));
////        list.add(new Item2("2", 10, new BigDecimal("9.99")));
////        list.add(new Item2("2", 10, new BigDecimal("9.99")));
//
//        list.forEach(x->x.getResult2());
//

        BiFunction<Integer, BigDecimal, Banana> ceshia = Banana::ceshia;

        BiFunction<String, Integer, Banana> ceshia2 = Banana::ceshia2;


        Function<Banana, String> getName = Banana::getResult2;
        BiFunction<String, String, String> testC = Banana::testC;



    }


}
