package reflect;

import java.lang.reflect.Field;
import java.sql.Timestamp;

/**
 * @Auther: rqxiao
 * @Date: 2019-6-25 09:27
 * @Description:
 */
public class Person {
    private int id;
    private int age;
    private String personName;
    private Timestamp birthdate;
    public String identitify;
    protected String address;
    String phone;

    public void test_getDeclaredFields() {
        Field[]fields=Person.class.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            System.out.println(field);

            System.out.println(field.getName());
        }

    }


    public static void main(String[] args) {
        Person p=new Person();
        p.test_getDeclaredFields();
    }

}