package SsytemArrayCopy;

/**
 * @Auther: rqxiao
 * @Date: 2019-6-21 10:52
 * @Description:
 */
public class SsytemArrayCopy {
    public static void main(String[] args) {




        int arr1[] = {0,1,2,3,4,5};
        int arr2[] = {0,10,20,30,40,50};



        System.arraycopy(arr1,0,arr2,1,2);

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }





        User[] users = new User[]{new User(1, "admin", "admin@qq.com"), new User(2, "maco", "maco@qq,com"), new User(3, "kitty", "kitty@qq,com")};//初始化对象数组
        User[] target = new User[users.length];//新建一个目标对象数组
        System.arraycopy(users, 0, target, 0, users.length);//实现复制
        System.out.println("源对象与目标对象的物理地址是否一样：" + (users[0] == target[0] ? "浅复制" : "深复制"));
        target[0].setEmail("admin@sina.com");
        System.out.println("修改目标对象的属性值后源对象users：");
        for (User user : users) {
            System.out.println(user);
        }
        for (User user : target) {
            System.out.println(user);
        }
    }
}

class User {
    private Integer id;
    private String username;
    private String email;

    //无参构造函数
    public User() {
    }

    //有参的构造函数
    public User(Integer id, String username, String email) {
        super();
        this.id = id;
        this.username = username;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User  [id=" + id + ",  username=" + username + ",  email=" + email
                + "]";
    }
}