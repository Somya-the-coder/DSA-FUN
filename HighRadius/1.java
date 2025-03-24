/*
Problem 1:
There are N bowls numbered from 1 to N and each bowl can contain maximum 9 marbles. A user has to add a marble to the last bowl i.e. Nth Bowl.
If Nth bowl is full i.e. it already has 9 marbles, you need to check in (N-1)th bowl. If (N-1)th bowl has space to accomodate one more marble, 
then you need to add marble in it and remove all the marbles from Nth bowl. You need to identify the bowl will be modified when you add a marble. 
If all bowls are full, print output as 0.
*/
import java.util.*;
class A
{
  public static void main(String args[])
  {
    Scanner in=new Scanner (System.in);
    int N=in.nextInt();
    int bowls[]=new int[N];
    for(int i=0;i<N;i++)
    {
        int bowls[i]=in.nextInt();
    }
    for(int i=N-1;i>=0;i--)
    {
      if(bowls[i]<9)
      {
        bowls[i]++;
        index_no_of_modified_bowl=i+1;//taking 1st bowl's index as bowl 1
        break;
      } 
      else
      {
        bowls[i]=0;
      }
    } 
    System.out.println(index_no_of_modified_bowl==0?0:index_no_of_modified_bowl);//If all bowls are full, print output as 0......given condition in question
    in.close();
    /*
    Why Use sc.close()?
Releases Resources:

Scanner uses an input stream (like System.in for console input).

When we call sc.close(), it closes the stream and releases system resources.

Prevents Resource Leaks:

If the program is long-running, keeping a scanner open can cause memory leaks.

Explicitly closing it ensures no unnecessary memory is used.

Avoids Warnings in Some IDEs:

Some IDEs (like Eclipse) may show a resource leak warning if Scanner is not closed.
    */
  }
}
