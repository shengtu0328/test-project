package stack;

import java.util.Stack;

/**
 * @program: test-project
 * @author: rqxiao
 * @create: 2019-01-15 15:03
 **/
public class lettcode32 {


    public static int kuohaosize(String s) {

        Stack stack = new Stack();

        int length = 0;

        for (int i = 0; i < s.length(); i++) {
            if ('(' == s.charAt(i)) {
                stack.push(s.charAt(i));
            } else {
                if (stack.size()!=0&&Character.valueOf((Character) stack.peek())== '(') {
                    stack.pop();
                } else {
                    stack.push(s.charAt(i));
                }
            }
        }


        return s.length() - stack.size();
    }


    public static void main(String[] args) {
        System.out.println(lettcode32.kuohaosize("))))"));

     /*   Stack stack = new Stack();


        stack.push(1);
        stack.push("2");
        stack.push(3);


        System.out.println(stack.peek());
        System.out.println(stack.pop());


        System.out.println(stack.peek());
        System.out.println(stack.pop());

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());*/


    }
}
