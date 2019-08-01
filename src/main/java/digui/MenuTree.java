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


                //调用 方法              只有     1
                menuTreelist.add(findChildren(menuTree, menulist));
            }
        }
        return menuTreelist;
    }

    public static MenuTree findChildren(MenuTree menuTree, List<Menu> menulist) {
        for (Menu menu : menulist) {
            if (menuTree.getId().equals(menu.getParentId())) {
                MenuTree childmenuTree = new MenuTree();
                childmenuTree.setId(menu.getId());
                childmenuTree.setName(menu.getName());
                menuTree.getMenuTreeList().add(findChildren(childmenuTree, menulist));
            }
        }
        return menuTree;
    }



/*

1.add(2,45)=  4 装好  再装 2.4  再 装 2 4.5
1.add(3,null)=1.add 3

 */




    /*
      (1  ,  2,3)
      (3    null)

      (2    4,5 )
      (4    null)
      (5    null)

     */
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
