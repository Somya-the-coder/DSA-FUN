/*
wo ﬁnite, strictly increasing, integer sequences are given. Any common integer between the two sequences constitute an intersection point. Take for example the following two sequences where intersection points are
printed in bold:

First= 3 5 7 9 20 25 30 40 55 56 57 60 62
Second= 1 4 7 11 14 25 44 47 55 57 100
You can ‘walk” over these two sequences in the following way:

You may start at the beginning of any of the two sequences. Now start moving forward.
At each intersection point, you have the choice of either continuing with the same sequence you’re currently on, or switching to the other sequence.
The objective is ﬁnding a path that produces the maximum sum of data you walked over. In the above example, the largest possible sum is 450, which is the result of adding 3, 5, 7, 9, 20, 25, 44, 47, 55, 56, 57, 60, and 62

Input
Your program will be tested on a number of test cases. Each test case will be speciﬁed on two separate lines. Each line denotes a sequence and is speciﬁed using the following format:

n v1 v2 ... vn
Where n is the length of the sequence and vi is the ith element in that sequence. Each sequence will have at least one element but no more than 10,000. All elements are between -10,000 and 10,000 (inclusive).
The last line of the input includes a single zero, which is not part of the test cases.

Output
For each test case, write on a separate line, the largest possible sum that can be produced.

Sample
Input:
13 3 5 7 9 20 25 30 40 55 56 57 60 62
11 1 4 7 11 14 25 44 47 55 57 100
4 -5 100 1000 1005
3 -12 1000 1001
0

Output:
450
2100
*/



// tc,sc=O(N)
//simple 2 pointers and max sum approach
import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner (System.in);
		int m=in.nextInt();
		int n=in.nextInt();
		int a1[]=new int[m];
		int a2[]=new int[n];
		for(int i=0;i<m;i++)	a1[i]=in.nextInt();
		for(int i=0;i<n;i++)	a2[i]=in.nextInt();
		
		int i=0,j=0,sum1=0,sum2=0,maxsum=0;
		//two pointers and max... approach
		while(i<m && j<n)
		{
			if(a1[i]<a2[j])
			{
				sum1+=a1[i];
				i++;//or in []only do i++
			}
			else if(a1[i]>a2[j])
			{
				sum2+=a2[j];
				j++;
			}
			else
			{
				maxsum+=Math.max(sum1,sum2)+a1[i];//here at coinciding point a1[i]=a2[j] so you can add any
				sum1=0;
				sum2=0;
				i++;
				j++;
			}
        // Add remaining elements from both arrays
        while (i < a1.length) sum1 += a1[i++];
        while (j < a2.length) sum2 += a2[j++];

        // Add max remaining sum
        maxSum += Math.max(sum1, sum2);
        return maxSum;
		}
	}
}
