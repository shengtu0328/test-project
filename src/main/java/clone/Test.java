package clone;

import lombok.Data;

/**
 * @author ：rqxiao
 * @description：TODO
 * @date ：2020/11/6 16:10
 */
@Data
public class Test implements Cloneable{

    private Address address;

    private String name;

    private int age;

    public void aa(){

    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj=super.clone();

        Address a=((Test)obj).getAddress();
        ((Test)obj).setAddress((Address) a.clone());
        return obj;
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        Test t1=new Test();
        t1.name="xrq";
        t1.age=44;
        t1.aa();

        Address address=new Address();
        address.setType("Home");
        address.setValue("北京");
        t1.setAddress(address);

        Test t2=t1;


        System.out.println(t1 == t2);


        Test t3 = (Test)t1.clone();



        t3.getAddress().setValue("美国");
        System.out.println("t1.name==t3.name"+t1.name==t3.name);


    }





}
