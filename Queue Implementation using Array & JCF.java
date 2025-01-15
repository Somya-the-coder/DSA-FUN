// The difference between stack and queue is in removing an element.
/*enqueue(): Inserts an element at the end of the queue i.e. at the rear end.
dequeue(): This operation removes and returns an element that is at the front end of the queue.
front(): This operation returns the element at the front end without removing it.
rear(): This operation returns the element at the rear end without removing it.
isEmpty(): This operation indicates whether the queue is empty or not.
isFull(): This operation indicates whether the queue is full or not.
size(): This operation returns the size of the queue i.e. the total number of elements it contains.

Disadvantages of Array Implementation:  
Static Data Structure, fixed size.

For implementing the queue, we only need to keep track of
two variables: "front and size". 
The front points to the first element in the queue, and 
size keeps track of the number of elements. 
When we enqueue an item, we insert it at the position front + size and then increment the size. 
For dequeuing, we check if the queue is empty and remove the item at the front. 
After removal, we shift all remaining elements to the left by one position. 
We then decrease the size to reflect the removal.
"OVERFLOW AND UNDERFLOW CHECKING IS NECESSARY IN ARRAY IMPLEMENTATION"

Definition:-
FIFO Principle in Queue:
FIFO Principle states that the first element added to the Queue 
will be the first one to be removed or processed. 
So, Queue is like a line of people waiting to purchase tickets, 
where the first person in line is the first person served. 
(i.e. First Come First Serve).
*/

//tc all operations=1, sc=n

//define fifo,operations,edge cases,real life eg ofthe word q itself(like mess mei line), application- scheduling, bfs implementation....where as stack application= valid parenthesis,backtracking(recursion),undo/redo,browser history,dfs,string reversal.
// interviewer tricks-- so draw and explain------> 1,2,4,0,91...highlight and tell front and rear positions(front=rear=0 & size=5)...array staic size(prev defined)
//when queue full rear=size i.e 5...if front dequeues' and go till 5 then underflow happens...also to push more-once rear=5, shift each elt towards left

// usually q using array is used with circular q, only q use JCF/LL(Famous interview qs)/Array-shown here
class MyQueue {

    int front, rear;
	int arr[] = new int[100005];

    MyQueue()
	{
		front=0;
		rear=0;
	}
	
	//Function to push an element x in a queue.
	void push(int x)//................rear
	{
	    // Your code here
	   if(rear==arr.length)
	   {
	       // overflow
	       return;
	   }
	       arr[rear]=x;
	       rear++;
	} 

    //Function to pop an element from queue and return that element.
	int pop()//...................front
	{
		// Your code here
		if(front==rear)
		{
		    //underflow
		    return -1;
		}  
		int s=arr[front];
		front++;
        return s;
	}
}
/*
Issue:-
but above code what if front=2, rear=arr.length, and there is space how can we insert?
Ans=To fix this issue, we can use a circular queue implementation, which allows the queue to wrap around and use the available space efficiently.

tabs navigation is eg of doubly LL (& stk we can say)
*/

//QUEUE IMPLEMENTATION JCF
class A
{
    public static void main(String args[]){
    Queue<Integer> q=new LinkedList<>();//queue is interface(having some methods) and is called using a class
    q.offer(1);
    System.out.println(q);//[1]...as list format as class is linkedlist
    System.out.println(q.poll());//1
    System.out.println(q.peek());//null
    }
}
