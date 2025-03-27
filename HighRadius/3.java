/*
Problem 3:
There are N street lights numbered from 1 to N. Each street lamp i has two numbers start(i), end(i) meaning they can
light all the streets numbered from start to end. You just need to find out how many areas are getting lighted.
*/
import java.itil.*;
public static void main(String args[])
{
  Scanner in=new Scanner(System.in);
  int N=in.nextInt();

  boolean[] lit=new boolean[10001];//assuming max street no.

  for(int i=0;i<N;i++)
  {
    int start=in.nextInt();
    int end=in.nextInt();
    for(int j=start;j<=end;j++)
      {
        lit[j]=true;
      }
  }
  int count=0;
  for(boolean b:lit)
    {
      if (b){
        count++;}
    }
  System.out.println(count);
  in.close();
}
//tc=O(N*R+M), sc=O(M).....hashset approach
//tc=O(N*R), sc=O(M).......boolean array approach
