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

    public static   father of(){
        return new father("fathermethod参数");

    }


    public static void main(String[] args) {

        father.of();



        son.of();
    }
}
