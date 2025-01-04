class Solution { 
    long findMinSum(int[] A,int[] B,int N) { 
        
        //EASY BUT TRICKY...CAME IN MY ONE OF THE COMPANY EXAMS
        
    //min differnce sum will give min value 
    //eg: 1,2,3,4...1-2 + 4-3 will only give minimum difference
    //And that is simply possible using Arrays.sort
    
    //optimized approach- use efficient sorting technique
    Arrays.sort(A);//also Arrays.parallelSort() with same nlogn tc sometimes give correct answer
    Arrays.sort(B);
    long ans=0;
    for(int i=0;i<N;i++)
    {
        ans+=Math.abs(A[i]-B[i]);
    }
    return ans;
    //TC=NlogN...for sorting + N...for loop = O(NlogN)
    //SC=O(1)
}
}
