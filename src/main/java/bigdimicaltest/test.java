package bigdimicaltest;

import java.math.BigDecimal;

public class test {


    public static void main(String[] args) {


        System.out.println(new BigDecimal("1.2").equals(new BigDecimal("1.20")));  //输出false
        System.out.println(new BigDecimal("1.2").compareTo(new BigDecimal("1.20")) == 0); //输出true
    }
}
