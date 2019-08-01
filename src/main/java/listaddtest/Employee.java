package listaddtest;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: rqxiao
 * @Date: 2019-7-30 13:56
 * @Description:
 */
public class Employee {

    private String name;

    private Integer age;

    private String dept;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }


    public Employee(String name, Integer age, String dept) {
        this.name = name;
        this.age = age;
        this.dept = dept;
    }

    public static void main(String[] args) {


        Employee e1 = new Employee("XRQ", 20, "技术1");
        Employee e2 = new Employee("XRQ", 20, "技术2");

        ArrayList<Employee> l=new ArrayList();
        l.add(e1);
        l.add(e2);

        e2.setName("lxq");



    }


}
