class Solution {
    public static int kthSmallest(int[] arr, int k) {
        //😬--qs states clearly not to use inbuilt method
        // Arrays.sort(arr);
        // return arr[k-1];
        
        //"smallest/largest" word in qs means use heap(inside priority queue)
        //Java by default is minheap. So,(.reverseOrder makes it maxheap)
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<k;i++)
        {
            pq.add(arr[i]);//add any 3 elts 1st- will rearrange itself in maxheap(refer to notes)
        }
        for(int i=k;i<arr.length;i++)
        {
            if(arr[i]<pq.peek())
            {
                pq.remove();
                pq.add(arr[i]);
            }
        }
        return pq.peek();
    }
}
//for kth largest- no coll.reverseOrder as by default PQ is minheap and change comparison symbol i.e. if arr[i]>pq.peek() ...remove peek & add arr[i]]
