/*
AGGRCOW - Aggressive cows
#binary-search

Farmer John has built a new long barn, with N (2 <= N <= 100,000) stalls. The stalls are located along a straight line at positions x1 ... xN (0 <= xi <= 1,000,000,000).

His C (2 <= C <= N) cows don't like this barn layout and become aggressive towards each other once put into a stall. To prevent the cows from hurting each other, FJ wants to assign the cows to the stalls, such that the minimum distance between any two of them is as large as possible. What is the largest minimum distance?

Input
t – the number of test cases, then t test cases follows.
* Line 1: Two space-separated integers: N and C
* Lines 2..N+1: Line i+1 contains an integer stall location, xi

Output
For each test case output one integer: the largest minimum distance.

Example
Input:

1
5 3
1
2
8
4
9
Output:

3
Output details:

FJ can put his 3 cows in the stalls at positions 1, 4 and 8,
resulting in a minimum distance of 3.
*/

//First of all its a maximization problem, so BINARY SEARCH must click into your mind.

import java.util.*;

public class AgressiveCows{
  public static boolean canPlaceCows(int[] stalls,int C,int minDist){
    //kaam
    int count=1,lastPos=stalls[0];//Place the 1st cow at 1st stall
    for(int i=1;i<stalls.length;i++)
      {
        if(stalls[i]-lastPos>=minDist){
          count++;
          lastPos=stalls[i];//Place the next cow here
          if(count==C)  return true;//All cows placed successfully
        }
      }
    return false;
  }

public static int findLargestMinDist(int[] stalls,int C){
  Arrays.sort(stalls);//binary search 1st step=sorted array
  int low=1,high=stalls[stalls.length-1]-stalls[0];
  int bestDist=0;

  //binary search
  whiel(low<=high){
    int mid=(low+high)/2;
    if(canPlaceCows(stalls,C,mid)){
      bestDist=mid;//Try for a larger minimum distance
      low=mid+1;
    }
    else{
      high=mid-1;//Reduce distance
    }
  }
  return bestDist;
}

public static void main(String args[])
{
  Scanner in = new Scanner (System.in);
  int t=in.nextInt();//no. of testcases
  while(t-- > 0)
    {
      int n=in.nextInt(),c=in.nextInt();//no. of stalls,no. of agressive cows
      int stalls[]=new int[n];//stall location(in beginning 1st stall=1)

      for(int i=0;i<n;i++)
        {
          stalls[i]=in.nextInt();
        }
      System.out.println(findLargestMinDist(stalls,C));
    }
  sc.close();
}
}
