package equalshashcode;

import java.util.HashMap;
import java.util.Objects;

/**
 * @Auther: rqxiao
 * @Date: 2019-7-18 09:12
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) &&
                Objects.equals(age, employee.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dept='" + dept + '\'' +
                '}';
    }

    public Employee(String name, Integer age, String dept) {
        this.name = name;
        this.age = age;
        this.dept = dept;
    }

    public static void main(String[] args) {


        Employee e1 = new Employee("XRQ", 20, "技术1");
        Employee e2 = new Employee("XRQ", 20, "技术2");
        Employee e3 = new Employee("XRQ", 20, "技术3");
        Employee e4 = new Employee("XRQ2", 20, "技术");

        System.out.println(e1 == e2);
        System.out.println(e1 == e3);
        System.out.println(e2 == e3);

        System.out.println(e1.equals(e2));
        System.out.println(e1.equals(e3));
        System.out.println(e2.equals(e3));



        HashMap map=new HashMap();
        map.put(e1,1);
        map.put(e2,2);
        map.put(e3,3);
//        map.put(e4,4);

        System.out.println(map);

    }


}
