package Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Auther: rqxiao
 * @Date: 2019-7-16 10:06
 * @Description:
 */
public class Car {




    public void drive(String driver,String car){

        System.out.println(driver + "  开 " + car);

    }



    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {

        Class<?> c = Class.forName("Reflection.Car");


        Method m = c.getMethod("drive", String.class, String.class);
        m.invoke(c.newInstance(),"otto","奔驰");




    }
}
