class Solution {
    public boolean canChange(String start, String target) {
        //Let's apply 2 pointers approach(not actually)- in 2 diff strings
        int i=0,j=0;
        int n=start.length();

        while(i<n || j<n)
        {
            //get letters
            while(i<n && start.charAt(i)=='_') i++;
            while(j<n && target.charAt(j)=='_') j++;

            //count is same if both the string end at the same time
            if(i==n || j==n)
                return (i==n && j==n);
            
            //check false conditions
            if((start.charAt(i)!=target.charAt(j)) ||
               (start.charAt(i)=='L' && j>i) ||
               (start.charAt(i)=='R' && j<i)
              )
              return false;
            
            i++;
            j++;
        }
        return true;//if whole loop executed successfully means false conditions never became true: & false was not returned
    }
}
