package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Auther: rqxiao
 * @Date: 2019-6-21 09:59
 * @Description:
 */
public class test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        ArrayList list = new ArrayList<>();

        //集合
        list.add(1);
        list.add(2);
        list.add(3);

        //Iterator迭代器
        //1、获取迭代器
        Iterator iter = list.iterator();
        //2、通过循环迭代
        //hasNext():判断是否存在下一个元素
        while(iter.hasNext()){
            //如果存在，则调用next实现迭代
            //Object-->Integer-->int
            int j=(int)iter.next();  //把Object型强转成int型
            if(j==2){

                iter.remove();

            }

          //  System.out.println(j);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }


}
