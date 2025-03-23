/*
//hackerearth have all hese questions

Problem 4:
There are N bus stops numbered from 1 to N. B[i] denotes the number of buses going from the ith bus stop.
Each bus will only stop in the bus stop which is the multiple of the bus stop the bus is initially in. which means
if a bus starts from 2nd bus stop, it will only stop in 2,4,6,8,10,12…. bus stops. If 3 then, 3 6 9 12 15 18.
Each bus if it goes from the ith bus stop, will also go from the next ith multiple bus stop. You need to tell the
number of unique buses from each bus stop.

///////
explaination:-
Understanding the Concept:
Each bus starts from its given bus stop.

Each bus stops at multiples of the stop it originates from.

The goal is to count how many new buses originate at each stop.

Given Input:
Copy
Edit
3
1 2 3
This means:

Bus Stop 1 has 1 bus.

Bus Stop 2 has 2 buses.

Bus Stop 3 has 3 buses.

Step-by-Step Breakdown
At Bus Stop 1:
A bus originates here.

This bus will stop at all multiples of 1 → {1, 2, 3}

Unique buses at Stop 1 = 1
(since no previous stops exist, we take all buses)
✅ Bus list after Stop 1: {1}

At Bus Stop 2:
The input says that 2 buses originate at Stop 2.

But Stop 2 already has a bus from Stop 1.

We need to count only new buses originating from Stop 2.

New unique buses at Stop 2 = Total buses (2) - Already existing bus (1) = 1
✅ Bus list after Stop 2: {1, 2}

At Bus Stop 3:
The input says that 3 buses originate at Stop 3.

But Stop 3 already has a bus from Stop 1.

New unique buses at Stop 3 = Total buses (3) - Already existing bus (1) = 2
✅ Bus list after Stop 3: {1, 2, 3}

Final Output:
Copy
Edit
1 1 2
Why Is There Only 1 New Bus at Stop 2?
Even though 2 buses are given for Stop 2, 1 of them already comes from Stop 1.
So, we only count the new bus originating at Stop 2.
///////
*/
//////////////////////////////////GALAT : 
// import java.util.*;
// class TestClass
// {
//     public static void main(String args[])
//     {
//         Scanner in=new Scanner(System.in);
//         int N=in.nextInt();
//         int a[]=new int[N];
//         for(int i=0;i<N;i++)
//         {
//             a[i]=in.nextInt();
//         }
//         // int prevbuses=0;//tracks already counted buses
//         Set<Integer> set=new HashSet<>();

//         for(int i=0;i<N;i++)
//         {
//             int count=0;
//             for(int j=i;j<N;j+=i)//TLE ERROR
//             {
//                 if(!set.contains(j))
//                 {
//                     set.add(j);
//                     count++;
//                 }
//             }
//             System.out.print(count+" ");

//             // int unique=a[i]-prevbuses;
//             // System.out.print(unique+" ");//+' '...adds space ka ascii+no. and gives its sum as the output
//             // prevbuses=unique;
//         }
//     }
// }


//use prefix sum approach.........no hashset & all
import java.util.*;

public class TestClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); // Number of bus stops
        int[] buses = new int[N + 1]; // Array for bus count
        
        // Read input values
        for (int i = 1; i <= N; i++) {
            buses[i] = sc.nextInt();
        }
        
        int[] uniqueBuses = new int[N + 1]; // To store unique buses count

        // Compute unique buses using an optimized approach
        for (int i = 1; i <= N; i++) {
            int newBuses = buses[i]; // Buses originating from this stop
            uniqueBuses[i] = newBuses; // Assign unique buses at this stop

            // Reduce the count from all multiples of 'i'
            for (int j = 2 * i; j <= N; j += i) {
                buses[j] -= newBuses;
            }
        }

        // Print output in space-separated format
        for (int i = 1; i <= N; i++) {
            System.out.print(uniqueBuses[i] + " ");
        }
        
        sc.close();
    }
}
