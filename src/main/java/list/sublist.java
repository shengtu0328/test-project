package list;

import java.util.ArrayList;

public class sublist {

    public static void main(String[] args){

        // 创建一个动态数组
        ArrayList<String> sites = new ArrayList<>();


        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Wiki");
        System.out.println("网站列表: " + sites);
        System.out.println("网站列表 size: " + sites.size());

        // 元素位置为1到3
        System.out.println("SubList: " + sites.subList(1,4));
    }
}
