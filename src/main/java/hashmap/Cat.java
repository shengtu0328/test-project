package hashmap;
 
import java.util.HashMap;
import java.util.Objects;
 
/**
 * @author robin
 * @email tigerofsky@163.com
 * @create 2020-10-23 22:15
 */
 
public class Cat {
    private String name;
    private String age;
    private String desc;
 
    private Cat(String name, String age, String desc) {
        this.name = name;
        this.age = age;
        this.desc = desc;
    }
 
    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Cat)){
            return false ;
        }
        Cat object1 = (Cat) object;
        return (this.name.hashCode() == object1.name.hashCode()) && (this.age.hashCode() == object1.age.hashCode());
 
    }
 
    @Override
    public int hashCode() {
        int code=name.hashCode();
        return code;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public void setAge(String age) {
        this.age = age;
    }
 
    public void setDesc(String desc) {
        this.desc = desc;
    }
 
    public static void main(String[] args){
        Cat cat1 = new Cat("aaa", "12", "first cat");
        Cat cat2 = new Cat("aaa", "14", "second cat");
        Cat cat3 = new Cat("aaa", "15", "second cat");


        Cat cat4 = new Cat("aaa", "12", "second cat");


        System.out.println("cat1.hashcode:"+cat1.hashCode());
        System.out.println("cat2.hashcode:"+cat2.hashCode());
        System.out.println("cat3.hashcode:"+cat3.hashCode());


        System.out.println("cat4.hashcode:"+cat4.hashCode());


        System.out.println("equals:"+ cat1.equals(cat2));
        System.out.println("equals:"+ cat1.equals(cat3));
        System.out.println("equals:"+ cat1.equals(cat4));





        HashMap map=new HashMap();
        map.put(cat1,"aaa");
        map.put(cat2,"bbb");
        map.put(cat3,"b");

    }
}