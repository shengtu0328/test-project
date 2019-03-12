package leetcode;

import java.util.*;

/**
 * @program: test-project
 * @author: rqxiao
 * @create: 2019-02-13 14:20
 **/
public class dfs2 {

    private Map <String, List<String>> graph = new HashMap<String, List<String>>();



    public void initGraphData() {




//          1
//        / |  \
//       2  5   4
//        \   /
//         3







//        图结构如下
//          1
//        /   \
//       2     3
//      / \   / \
//     4  5  6  7
//      \  / \ /
//        8    9
        graph.put("1", Arrays.asList("2", "3"));
        graph.put("2", Arrays.asList("1", "4", "5"));
        graph.put("3", Arrays.asList("1", "6", "7"));
        graph.put("4", Arrays.asList("2", "8"));
        graph.put("5", Arrays.asList("2"));
        graph.put("6", Arrays.asList("3", "8", "9"));
        graph.put("7", Arrays.asList("3", "9"));
        graph.put("8", Arrays.asList("4", "6"));
        graph.put("9", Arrays.asList("6", "7"));
    }






    private Map<String, String> status = new HashMap<String, String>();






    private static Stack<String> stack = new Stack<String>();
    public void DFSSearch(String startPoint) {
        stack.push(startPoint);
        dfsLoop();
    }




    private static List<String> list= new ArrayList<>();  //最终结果

    private void dfsLoop() {
        if(stack.empty()){
            return;
        }
        String stackTopPoint = stack.peek();

        List<String> neighborPoints = graph.get(stackTopPoint);

        boolean contains=false;//flase代表 此节点的所有子节点都已遍历， TRUE代表还有子节点可以遍历

        for (String point : neighborPoints) {
            if (!list.contains(point)) { //未被遍历
                list.add(point);
                stack.push(point);
                dfsLoop();
                contains=true;

            }


        }
/*
        if(!contains){
            stack.pop();

        }*/
    }


    public static void main(String[] args) {
        dfs2 test = new dfs2();
        test.initGraphData();
        list.add("1");
        test.DFSSearch("1");

//        test.BFSSearch("1");

        System.out.println(list);
        System.out.println(stack);

    }






}
