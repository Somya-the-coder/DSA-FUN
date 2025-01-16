// Circular Queue using Array....with array only circular queue implementation is the most famous 
class MyCircularQueue {
    /*One of the benefits of the circular queue is that we can make use of the spaces in front
     of the queue. In a normal queue, once the queue becomes full, we cannot insert the next 
     element even if there is a space in front of the queue. But using the circular queue, 
     we can use the space to store new values. */
int front,rear,queue[],k;

//CIRCULAR QUEUE : ARRAY BEST WAY
//q mei bas ek hi kaam hai-> """rear+=1 and front+=1""" here  in cir q a bit of change i.e. rear=(rear+1)%n
//ALSO in qs given->You must solve the problem without using the built-in queue data structure in your programming language.
    public MyCircularQueue(int n) {
        k=n;
        queue=new int[k];
        front=rear=-1;
        // int front=rear=-1;...1st define both or any one then u can initialize in java as a=b=0
    }
    
    public boolean enQueue(int value) {
        //checking isFull()- not by directly using it as its not JCF...but by implementing the isFull function.
        if ((rear+1)%k==front){//overflow...q is full
              return false;
        }
        if(rear==-1){//1st elt to be inserted
            front++;
            rear++;
        }
        else{
            rear=(rear+1)%k;//main kaam
        }
        queue[rear]=value;
        return true;
    }
    
    public boolean deQueue() {
        if(front==-1)//underflow
        {
            return false;
        }
        if(front==rear)//q has single elt
        {
            front=rear=-1;
        }
        else{
            front=(front+1)%k;//main kaam
        }
        return true;
    }
    
    public int Front() {
        if(front==-1) return -1;//q is empty=underflow
        return queue[front];
    }
    
    public int Rear() {
        if(rear==-1) return -1;//q is empty
        return queue[rear];
    }
    
    public boolean isEmpty() {
        if(front==-1) return true;
        return false;
    }
    
    public boolean isFull() {
        if ((rear+1)%k==front)
            return true;
        return false;
    }
}
