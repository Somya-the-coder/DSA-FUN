/*
Problem 2:
There are N interns numbered from 1 to N. Each intern is assigned a unique ID for each day. Rules being 1<=N<=24.
The ith intern has an ID of (5000*i) on day 1 and for the rest of the days, Day(i) = Day(i-1)+5000+(i-1)
Input to the problem is ID of intern. Output is number of intern on particular day.

//note read the question nicely , in o/p not the no. of employees asking but the employee number
//see cool dryrun in copy
//each column it travels and check math with the entered and print its i
*/

import java.util.*;
public static void main(String args[])
{
  Scanner in=new Scanner(System.in);
  int targetID=in.nextInt();

  int i=1;
  int dayID=5000*i;//1st day id of intern 1

  while(dayID<targetID)
    {
      int day=1;
      int previousDayID=dayID;
      while(dayID<targetID)
      {
        day++;
        dayID=previousID+5000+(i-1);
        previousDayID=dayID;
      }
      if(dayID==targetID)
      {
        System.out.println(i+" "+day);
        return;
      }
      i++;
      dayID=5000*i;
    }
}
