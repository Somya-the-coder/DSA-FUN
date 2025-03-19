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
