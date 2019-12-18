package constructtest;

import lombok.Data;

/**
 * @Author: rqxiao
 * @Date: 2019-12-2 14:12
 * @Description:
 */
@Data
public class father {

    public String name;

    public father() {
        System.out.println("father 无参");

    }


    public father(String name) {

        System.out.println("father 有参");
        this.name = name;
    }


    public static void main(String[] args) {
        father father=new father();

        father father2=new father("1");



        son son2=new son("sdasd");


    }
}
