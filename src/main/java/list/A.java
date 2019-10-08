package list;

/**
 * @Author: rqxiao
 * @Date: 2019-9-12 09:36
 * @Description:
 */
public class A{
    private String name;
    private String age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public static void main(String[] args) {
        String projectPath = System.getProperty("user.dir");
        System.out.println(projectPath);
    }
}
