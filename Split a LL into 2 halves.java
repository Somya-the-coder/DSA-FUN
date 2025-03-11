class gfg
{
void splitList(circular_Linked list)
{
Node head=list.head;
Node head1=null;
Node head2=null;

Node slow=head;
Node fast=head;
while(fast.next!=head && fast.next.next!=head)
{
slow=slow.next;
fast=fast.next.next;
}
head2=slow.next;//do at first so that 2nd half link do not get lost
head1=head;
//now to make both circular
if(fast.next=head)
	fast.next=head2;//if odd no. of nodes
else
	fast.next.next=head2;// if even no. of nodes
}
}
//tc=O(n/2)
//sc=O(1)
