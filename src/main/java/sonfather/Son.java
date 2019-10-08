package sonfather;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: rqxiao
 * @Date: 2019-9-24 15:57
 * @Description:
 */
public class Son implements jiekou{

    private String b;


    public static void main(String[] args) {


        List list=new ArrayList();


        Son s= new Son();

        jiekou jiekou = Son.get();


        //返回值不能用实现类去接接口
//        Son son = Son.get();

        Son son2 = Son.getSon();

        //返回值能用实现类去接接口
        jiekou jj=Son.getSon();

    }





    public static jiekou get(){

        return null;
    }

    public static Son getSon(){

        return null;
    }


}
