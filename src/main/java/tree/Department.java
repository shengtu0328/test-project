package tree;

import java.util.ArrayList;

public class Department {

    private int id;

    private String title;

    private ArrayList<Department> childern = new ArrayList<Department>();

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

    public ArrayList<Department> getChildern() {
        return childern;
    }

    public void setChildern(ArrayList<Department> childern) {
        this.childern = childern;
    }


    private static Department department = new Department();

    public static void getresult(Department0 d0, Department ddd) {

        if (d0.getPath().length() == 0) {
            ddd.setId(d0.getId());
            ddd.setTitle(d0.getTitle());
            ddd.setChildern(new ArrayList<Department>());
            return;
        }
        Department d = new Department();
        d.setId(d0.getId());
        d.setTitle(d0.getTitle());
        if (Integer.valueOf(d0.getPath().substring(d0.getPath().length() - 3, d0.getPath().length() - 2)) == ddd.getId()) {
            d.setChildern(new ArrayList<Department>());
            ddd.getChildern().add(d);
        } else {
            for (Department dd : ddd.getChildern()) {
                getresult(d0, dd);
            }
        }

    }


    public static void getlist(Department department){
        System.out.println(department.getTitle());
        for (int i = 0; i < department.getChildern().size(); i++) {
            getlist(department.getChildern().get(i));
        }

    }

    public static void main(String[] args) {
        ArrayList<Department0> list = Department0.getlist();
        Department d = new Department();
        for (int i = 0; i < list.size(); i++) {
            Department.getresult(list.get(i), d);
        }
        //System.out.println(d);
        Department.getlist(d);






        //Map<Integer, Integer> collect = list.stream().collect(Collectors.groupingBy(d0 -> d0.getPath().length(), Collectors.summingInt(Department0::getId)));

        //List<Department0> list0 = list.stream().filter(department0 -> department0.getPath().length() == 0).collect(Collectors.toList());
        //List<Department0> list3 = list.stream().filter(department0 -> department0.getPath().length() == 3).collect(Collectors.toList());
        //List<Department0> list5 = list.stream().filter(department0 -> department0.getPath().length() == 5).collect(Collectors.toList());

    }

}
