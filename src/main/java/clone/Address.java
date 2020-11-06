package clone;

import lombok.Data;

/**
 * @author ：rqxiao
 * @description：TODO
 * @date ：2020/11/6 16:35
 */
@Data
public class Address implements Cloneable{

    private String type;
    private String value;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
