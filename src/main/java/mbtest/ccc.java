package mbtest;

import java.math.BigDecimal;

/**
 * @Description: TODO
 * @Author rqxiao
 * @date 2021/3/22 16:36
 */
public class ccc {


    public static BigDecimal getMbByByte(long size) {
        BigDecimal mb = new BigDecimal(size).divide(new BigDecimal(1024 * 1024), 1, BigDecimal.ROUND_HALF_UP);
        return mb;
    }

    public static void main(String[] args) {
        System.out.println(getMbByByte(53477376L));//51M
        System.out.println(getMbByByte(21474836480L));//20G
        System.out.println(getMbByByte(500*1024));//2G
    }

}
