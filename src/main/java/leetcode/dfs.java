package leetcode;

import java.util.*;

/**
 * @program: test-project
 * @author: rqxiao
 * @create: 2019-02-13 14:20
 **/
public class dfs {

    private Map <String, List<String>> graph = new HashMap<String, List<String>>();



    public void initGraphData() {
//        图结构如下
//          1
//        /   \
//       2     3
//      / \   / \
//     4  5  6  7
//      \ | / \ /
//        8    9
        graph.put("1", Arrays.asList("2", "3"));
        graph.put("2", Arrays.asList("1", "4", "5"));
        graph.put("3", Arrays.asList("1", "6", "7"));
        graph.put("4", Arrays.asList("2", "8"));
        graph.put("5", Arrays.asList("2", "8"));
        graph.put("6", Arrays.asList("3", "8", "9"));
        graph.put("7", Arrays.asList("3", "9"));
        graph.put("8", Arrays.asList("4", "5", "6"));
        graph.put("9", Arrays.asList("6", "7"));
    }






    private Map<String, Boolean> status = new HashMap<String, Boolean>();






    private Stack<String> stack = new Stack<String>();
    public void DFSSearch(String startPoint) {
        stack.push(startPoint);
        status.put(startPoint, true);
        dfsLoop();
    }


    private void dfsLoop() {
        if(stack.empty()){
            return;
        }
        //查看栈顶元素，但并不出栈
        String stackTopPoint = stack.peek();
        //  2) 找出与此点邻接的且尚未遍历的点，进行标记，然后全部放入queue中。
        List<String> neighborPoints = graph.get(stackTopPoint);
        for (String point : neighborPoints) {
            if (!status.getOrDefault(point, false)) { //未被遍历
                stack.push(point);
                status.put(point, true);
                dfsLoop();
            }
        }
        String popPoint =  stack.pop();
        System.out.println(popPoint);
    }


    public static void main(String[] args) {
        dfs test = new dfs();
        test.initGraphData();
//        test.BFSSearch("1");
        test.DFSSearch("1");
    }






}
