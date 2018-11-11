package tree;

import java.util.ArrayList;

public class Department0 {

    private int id;

    private String title;

    private String path;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Department0(int id, String title, String path) {
        this.id = id;
        this.title = title;
        this.path = path;
    }

    public static ArrayList<Department0> getlist(){

        ArrayList<Department0> list =new ArrayList<Department0>();
        list.add(new Department0(1,"一",""));
        list.add(new Department0(2,"二","1.2"));
        list.add(new Department0(3,"三","1.3"));
        list.add(new Department0(4,"四","1.2.4"));
        list.add(new Department0(5,"五","1.3.5"));
        list.add(new Department0(6,"六","1.3.6"));
        return list;
    }


    public static void main(String[] args) {
        String s="1.2.4";
        System.out.println(s.substring(s.length() - 3, s.length() - 2));
    }
}
