//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine().trim());

        while (t-- > 0) {
            // Read the start times
            String[] startInput = reader.readLine().trim().split("\\s+");
            List<Integer> start = new ArrayList<>();
            for (String s : startInput) {
                start.add(Integer.parseInt(s));
            }

            // Read the end times
            String[] endInput = reader.readLine().trim().split("\\s+");
            List<Integer> end = new ArrayList<>();
            for (String s : endInput) {
                end.add(Integer.parseInt(s));
            }

            // Create solution object and call activitySelection
            Solution obj = new Solution();
            System.out.println(obj.activitySelection(start, end));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends



class Solution {
    public int activitySelection(List<Integer> start, List<Integer> end) {
        //1st convert all to 2d arr(index,str,end)
        
        //USE LIST "NOT 2D ARRAY"
        //int activities[][]=new int[start.size()][3];
        List<int[]> activities = new ArrayList<>();
        for(int i=0;i<start.size();i++)
        {
            // activities[i][0]=i;
            // activities[i][1]=start.get(i);
            // activities[i][2]=end.get(i);
            activities.add(new int[]{start.get(i),end.get(i)});
        }
        //Arrays.sort(activities,Comparator.comparingInt(o->o[2]));
        activities.sort(Comparator.comparingInt(a->a[1]));
        
        //int lastEnd=activities[0][2];
        int lastEndTime=activities.get(0)[1];
        int count=1;
        
        for(int i=1;i<activities.size();i++)
        {
            //if(activities[i][1]>lastEnd)// col 2 has start time
            if(activities.get(i)[0]>lastEndTime)
            {
                count++;
                //lastEnd=activities[i][2];
                lastEndTime=activities.get(i)[1];
            }
        }
        return count;
    }
}
