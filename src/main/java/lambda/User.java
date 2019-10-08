package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Auther: rqxiao
 * @Date: 2019-7-2 11:06
 * @Description:
 */
public class User {

    private String name;

    private String address;
    private Integer age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public User(String name, String address, Integer age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public static void main(String[] args) {

        User user1 = new User("4", "beijing", 10);
        User user2 = new User("6", "beijing", 20);
        User user3 = new User("3", "shanghai", 30);
        User user4 = new User("2", "shanghai", 30);
        User user5 = new User("1", "shanghai", 30);



        List<User> list = new ArrayList<User>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        list.add(user5);

        Map<String, Map<String, List<User>>> collect
                = list.stream().collect(
                Collectors.groupingBy(
                        User::getAddress, Collectors.groupingBy(User::getName)
                )
        );

        System.out.println(collect);
    }
}
