package lambda;

import java.math.BigDecimal;

/**
 * @Auther: rqxiao
 * @Date: 2019-7-2 10:50
 * @Description:
 */
public class Item {

    private String name;
    private int id;
    private BigDecimal price;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Item(String name, int id, BigDecimal price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", price=" + price +
                '}';
    }
}
