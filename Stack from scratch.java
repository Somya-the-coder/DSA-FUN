//STACK USING JCF

import java.util.*;
class Stack_basic
{
    public static void main(String args[])
    {
        Stack<Integer> stk=new Stack<>();//handle empty case ...12 class yaad haina
        stk.push(20);
        stk.push(30);
        System.out.println(stk);//in list type form [. , .]
        stk.pop();
        System.out.println(stk);
        // System.out.println(stk.pop());//EmptyStackException is thrown
        System.out.println(stk.peek());

        stk.push(90);
        System.out.println(stk.pop());
    }  
}

