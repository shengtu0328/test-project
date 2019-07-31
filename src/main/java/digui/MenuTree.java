package digui;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: rqxiao
 * @Date: 2019-7-30 17:37
 * @Description:
 */
public class MenuTree {


    private Integer id;

    private String name;

    private List<MenuTree> menuTreeList = new ArrayList<>();

    public static List<MenuTree> getTree(List<Menu> menulist) {
        List<MenuTree> menuTreelist = new ArrayList<>();
        for (Menu menu : menulist) {
            if (menu.getParentId() == null) {
                MenuTree menuTree = new MenuTree();
                menuTree.setId(menu.getId());
                menuTree.setName(menu.getName());
                menuTreelist.add(findChildren(menuTree, menulist));
            }
        }
        return menuTreelist;
    }

    public static MenuTree findChildren(MenuTree menuTree, List<Menu> menulist) {
        for (Menu menu:menulist) {
            if(menuTree.getId().equals(menu.getParentId())){
                MenuTree menuTree1 = new MenuTree();
                menuTree1.setId(menu.getId());
                menuTree1.setName(menu.getName());
                menuTree.getMenuTreeList().add(findChildren(menuTree1,menulist));
            }
        }
        return menuTree;
    }

    public static void main(String[] args) {
    /*
    1
    2   3
    45
     */
        Menu m1 = new Menu(1, "一", null);

        Menu m2 = new Menu(2, "二", 1);
        Menu m3 = new Menu(3, "三", 1);


        Menu m4 = new Menu(4, "四", 2);
        Menu m5 = new Menu(5, "五", 2);

        List<Menu> menulist = new ArrayList<>();
        menulist.add(m1);
        menulist.add(m2);
        menulist.add(m3);
        menulist.add(m4);
        menulist.add(m5);
        List<MenuTree> list = MenuTree.getTree(menulist);
        System.out.println(list);

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<MenuTree> getMenuTreeList() {
        return menuTreeList;
    }

    public void setMenuTreeList(List<MenuTree> menuTreeList) {
        this.menuTreeList = menuTreeList;
    }
}
