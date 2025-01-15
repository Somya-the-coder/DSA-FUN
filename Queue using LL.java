/*The structure of the node of the queue is
class QueueNode
{
	int data;
	QueueNode next;
	QueueNode(int a)
	{
	    data = a;
	    next = null;
	}
}*/

//SO, ARRAY SE circular queue is famous, normal q implementation=JCF>LL>Array...same tc , sc, ...but for ease of code and understanding
//LL mei humloh a=b=null kar sakte hai
//kul milakar humlog rear=rear+1 when pushed, and front=front+1 when popped kar rahe hai
class MyQueue
{
    QueueNode front, rear;
    
    MyQueue(){ front=rear=null;}//non para constructor to initialize front & rear
    //Function to push an element into the queue.
	void push(int a)//....rear ke saath play
	{
        // Your code here
        QueueNode newnode=new QueueNode(a);//LL mei naya node aise hi banta hai
        //if 1st node mei pushed
        if(rear==null)
        {
            front=rear=newnode;
        }
        else{
        rear.next=newnode;//pehle point karwao
        rear=newnode;//phir bhejo
        }
	}
	
    //Function to pop front element from the queue.
	int pop()//.....front ke saath khelo
	{
        // Your code here
        if(front==null)//euivalent to if queue...isEmpty()
            return -1;//underflow
            
        QueueNode temp=front;
        front=front.next;//front ko front ka next bhejna haina toh pehle hi head (front) ko kahi store zarur karlo
        if(front==null) //If you don't set rear to null, rear will still reference the last node (which is the node with data 5), even though the queue is now empty.
            rear=null;// If the queue becomes empty after the pop, update rear to null
        return temp.data;
	}
}
