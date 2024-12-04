//push heavy
import java.util.*;
public class StackUsingQueues{
    Queue<Integer> queue1=new LinkedList<>();
    Queue<Integer> queue2=new LinkedList<>();

    //push heavy/costly/compromisable/bigger code of push 
    public void push(int val){
        //internally use queue just name finctions as stack methods
        while(!queue1.isEmpty())
        {
            queue2.offer(queue1.poll());
            //offer=enqueue and poll=dequeue in JCollectionsF
        }
        queue1.offer(val);//new elt pushing
        while(!queue2.isEmpty())
        {
            queue1.offer(queue2.poll());
            //offer=enqueue and poll=dequeue in JCollectionsF
        }
    }
        
        //smaller code of pop
        public int peek(){
        if(queue1.isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return queue1.peek();
        }

        public int pop(){
            if(queue1.isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            return queue1.poll();
            }
        public static void main(String[] args) {
            StackUsingQueues stack = new StackUsingQueues();
            stack.push(10);
            stack.push(20);
            stack.push(30);
            System.err.println(stack.peek());
            System.err.println(stack.pop());
            System.err.println(stack.peek());
        }
}
