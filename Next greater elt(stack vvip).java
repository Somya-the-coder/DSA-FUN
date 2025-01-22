class Solution {
    // Function to find the next greater element for each element of the array.
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        
        ArrayList<Integer> list=new ArrayList<>();
        
        // //M1: SIMPLE ARRAY...TC=O(n^2),SC=O(1)
 
        int n=arr.length;
        // for(int i=0;i<n;i++)
        // {
        //     int m=arr[i];
        //     for(int j=i+1;j<n;j++)
        //     {
        //         if(arr[j]>arr[i]){
        //             arr[i]=arr[j];
        //             break;
        //         }
        //     }
        //     if (arr[i]==m)
        //         arr[i]=-1;
        //     list.add(arr[i]);
        // }
        // return list;
        
        //M2: OPTIMIZED---STACK...see notes for even alter in code for more such qs
        //TC=O(n),SC=O(n)
        //1st see gfg animation/notes copy...(i/p arr + stack + ans array)
        Stack<Integer> stk=new Stack<>();
        
        //imp to write
        for(int i=0;i<n;i++)
            list.add(-1);
        
        for(int i=n-1;i>=0;i--)
        {
            while(!stk.isEmpty() && stk.peek()<=arr[i])//<= writing is imp
                stk.pop();//keep on popping until you find next greater value at top
                
            if(!stk.isEmpty())
                list.set(i,stk.peek());//put the peek elt in result list...set method in arrlist is used for inserting at desired index else u know use add()
            
            stk.push(arr[i]);//alw executed
        }
        return list;
    }
}
