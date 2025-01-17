/* all tc=O(1), sc=O(n)
Deque or Double Ended Queue is a generalized version of Queue data structure that allows insert and delete at both ends.

NOTE:The ArrayDeque class in Java is an implementation of the Deque interface that uses a resizable array to store its elements.

Deque<Integer> deque = new ArrayDeque<>();

add(E e), offer(E e), addFirst(E e), offerFirst(E e), addLast(E e), 
offerLast(E e), remove(), poll(), removeFirst(), pollFirst(), removeLast(),
pollLast(), getFirst(), peekFirst(), getLast(), peekLast(), size(), isEmpty(), 
clear(), contains(Object o), iterator(), descendingIterator(), remove(Object o),
removeFirstOccurrence(Object o), removeLastOccurrence(Object o)


Some Practical Applications of Deque:

Applied as both stack and queue, as it supports both operations.

Storing a web browser’s history...........IMPORTANT

Storing a software application’s list of undo operations.
Job scheduling algorithm
Monotonic Deque : 

It is deque which stores elements in strictly increasing order or in strictly decreasing order 

*/  
  public static void push_back_pb(ArrayDeque<Integer> dq, int x) {
    dq.addLast(x);
}

// Function to pop element from back of the deque.
  public static void pop_back_ppb(ArrayDeque<Integer> dq) {
      if(!dq.isEmpty())
            dq.removeLast();
}

// Function to return element from front of the deque.
  public static int front_dq(ArrayDeque<Integer> dq) {
    if(!dq.isEmpty())
        return dq.getFirst();
    return -1;
}

// Function to push element x to the front of the deque.
  public static void push_front_pf(ArrayDeque<Integer> dq, int x) {
    dq.addFirst(x);
}
