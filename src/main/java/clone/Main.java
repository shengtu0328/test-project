package clone;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    static Main ins = new Main();

    //内部类
    class Node{
        int val;
        Node(int val){
            this.val = val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return "Node [val=" + val + "]";
        }

    }

    public static void main(String[] args) {


        ArrayList<Node> list = new ArrayList<Node>();
        list.add(ins.new Node(2));
        list.add(ins.new Node(11));
        list.add(ins.new Node(44));

        ArrayList<Node> newlist = (ArrayList<Node>) list.clone();

        //修改list中元素之前的newlist
        for(Node k : newlist){
            System.out.println(k);
        }
        //修改list中index为0的对象的值为90
        list.get(0).setVal(90);
        System.out.println("--------------------------------");

        //修改后newlist，index为0的对象也变化了
        for(Node k : newlist){
            System.out.println(k);
        }
    }
}