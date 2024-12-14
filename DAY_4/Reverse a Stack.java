//REVERSING A STACK WITHOUT RECURSION - U CAN PUSH STK IN QUEUE AND BACK TO STK T'LL BE REVERSED
//ALSO YOU CAN POP AND PUSH ALL IN ANOTHER STACK AND (NAME IT AS ORIGINAL STK) BUT T'LL TAKE EXTRA SPACE 
//REVERSE A STACK USING RECURSION- EXTRA LINES OF CODE REDUCED, GOOD FOR LIMITED INPUTS, Simplicity and Readability,  Minimal Boilerplate
import java.util.*;
public class StackClass{
    public static void pushAtBottom(int data,Stack<Integer> s){
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtBottom(data,s);
        s.push(top);
    }
    public static void reverse(Stack<Integer> s){
        if(s.isEmpty())
            return;
        int top=s.pop();
        reverse(s);
        pushAtBottom(top,s);
    }
    public static void main(String args[]){
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        reverse(s);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
