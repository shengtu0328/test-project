package list;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: rqxiao
 * @Date: 2019-12-30 17:54
 * @Description:
 */
public class listget0null {


    public static void main(String[] args) {
        List<A> list=null;

        if(list==null||list.size()==0){
            System.out.println("true");
        }

    }
}
