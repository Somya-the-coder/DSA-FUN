//tc=1, sc=n...they're based on - no. of inputs(n) & no. of instructions/lines....& obviously not real global time

import java.util.*;
/*You can resolve this issue by making top a class-level static variable (shared across all methods in the class), ensuring its value persists and is updated correctly. */

class A{
        //also handle empty cases
        static int top = -1; // Initialize top as -1 for an empty stack

        // Push operation
        public static void push(int arr[]) {
            if (top >= arr.length - 1) { // Check for stack overflow
                System.out.println("Stack Overflow");
                return;
            }
            arr[++top] = 20; // Increment top and insert the value
            System.out.println("Pushed: " + arr[top]);
        }
    
        // Pop operation
        public static void pop(int arr[]) {
            if (top < 0) { // Check for stack underflow
                System.out.println("Stack Underflow");
                return;
            }
            System.out.println("Popped: " + arr[top]);
            top--; // Decrement top
        }
    
        // Peek operation
        public static void peek(int arr[]) {
            if (top < 0) { // Check if the stack is empty
                System.out.println("Stack is Empty");
                return;
            }
            System.out.println("Top Element: " + arr[top]);
        }
public static void main(String args[])
{
/*Static methods belong to the class and are called using the class name (A.display()).
Non-static methods belong to the object and are called using an instance of the class (obj.display()). */
    int arr[]=new int[20];
    A.push(arr);
    A.pop(arr);
    A.peek(arr);
}
}
