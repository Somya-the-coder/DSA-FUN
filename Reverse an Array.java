class Solution {
    public void reverseArray(int arr[]) {
        
        // M2:IN-PLACE REVERSAL-2 pointers Approach:starting from 1st and last 
        int i=0,j=arr.length-1,temp=0;
        //for(int k=0;k<arr.length/2;k++)//...length/2 remember else(if ru run till whole length : original form comes
        while(i<j)//I<=J CAUSES TLE
            //REM:I<=J CAUSES TLE...AS GROWS GREATER WITH SIZE OF INPUT...as there might be hidden implicit nested loops while checking
        {
            //take temp then only u can swap na!--arr[i]=arr[j];...just this won't work, its not python
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;
        }
            //tc=O(n),sc=O(1)
        
        
        
        // // M1:BRUTEFORCE
        // int l=arr.length;
        // int a[]=new int[l];
                // // a=arr;//it can't be done bcz u doubly initialized a
                // // int a[]=arr;//When you assign a = arr, you don’t create a new array; you only create a new reference to the same array.
                // // System.out.println(a+"p"+arr);
        // for(int i=0;i<l;i++)
        // {
        //     a[i]=arr[i];
        // }
        // for(int i=0;i<l;i++)
        // {
        //     arr[i]=a[l-i-1];
        // }
            ////tc=O(n), sc=O(n)
       
       
       
      
           
       
        //already done in main function so no need to write again ; the return type is void
        // for(int i=0;i<l;i++)
        // {
        //     System.out.print(arr[i]);
        // }
    }
}
