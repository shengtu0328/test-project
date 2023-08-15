package stream.groupcount;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Tolerate;
import java.util.*;
import java.util.stream.Collectors;
/***
 *
 *Create by 范春宇 on 2019/12/26 17:22
 */
@Data
public class RealSkuVo implements Cloneable{
    private String realEan;
    private Integer realQty;
    public static void main(String[] args) throws CloneNotSupportedException {
        List<RealSkuVo> list = new ArrayList<>();
        RealSkuVo a = new RealSkuVo();
        RealSkuVo b1 = (RealSkuVo)a.clone();
        b1.setRealEan("asdasda");
        b1.setRealQty(1);
        RealSkuVo b2 = (RealSkuVo)a.clone();
        b2.setRealEan("asdasda2");
        b2.setRealQty(2);
        RealSkuVo b3 = (RealSkuVo)a.clone();
        b3.setRealEan("asdasda3");
        b3.setRealQty(3);
        RealSkuVo b4 = (RealSkuVo)a.clone();
        b4.setRealEan("asdasda3");
        b4.setRealQty(4);
        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);
        Map<String, LongSummaryStatistics> collect = list.stream().collect(Collectors.groupingBy(RealSkuVo::getRealEan,Collectors.summarizingLong(RealSkuVo::getRealQty)));
        Map<String, Long> collect1 = list.stream().collect(Collectors.groupingBy(RealSkuVo::getRealEan, Collectors.counting()));
        System.out.println(collect);
    }
}