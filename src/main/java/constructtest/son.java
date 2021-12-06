package constructtest;

import lombok.Data;

/**
 * @Author: rqxiao
 * @Date: 2019-12-2 14:13
 * @Description:
 */
@Data
public class son extends father {

    public son() {
        System.out.println("son 无参");

    }

    public son(String name) {

        super(name);

    }

    public static   father of(){
        return new son("fathermethod参数");

    }
}
