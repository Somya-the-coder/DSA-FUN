/*
Alternative Approach Using Sorting
Sort the array: Time complexity is O(n log n).
Count frequencies in a single pass: Time complexity is O(n).
*/

//HASHMAP APPROACH
class Solution {
    int maxRepeating(int k, int[] arr) {
        // code here
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:arr)
        {
           map.put(i,map.getOrDefault(i,0)+1);
        }
        int max=0;
        int elt=0;
        //no ordering in hashmap- so with need to iterate using these
        for(Map.Entry<Integer,Integer> entry:map.entrySet())//rem both map and entry in interface name is in capital letters
        {
            if(entry.getValue()>max)
            {
                max=entry.getValue();
                elt=entry.getKey();
            }
            //handling edge case
            else if((entry.getValue() == max) && (entry.getKey()<elt))//elt here is max elt
            {
                elt=entry.getKey();
            }
            //System.out.println(entry+"##"+map.entrySet());
            /*Above sopln prints:
                Your Output: 
                    1=1##[1=1, 2=3]
                    2=3##[1=1, 2=3]  
            */
        }
        return elt;
    }
}

// Each put operation in the HashMap takes average O(1) time.
// Time Complexity: O(n)
// Space Complexity: O(n)
// This analysis shows that your maxRepeating method is efficient in terms of both time and space for processing the input array.


/*The Map.Entry Interface
In Java, Map.Entry is an interface that provides a view of a key-value pair in a Map. It's a nested interface within the Map interface. It has a few important methods:

using map.entry we get the privilege of using these 3 wonderful methods with() symbol -don't forget
getKey(): Returns the key corresponding to this entry.

getValue(): Returns the value corresponding to this entry.

setValue(V value): Replaces the value corresponding to this entry with the specified value.

Using entrySet()
The entrySet() method of a Map returns a set of Map.Entry objects. This set contains all the key-value pairs in the map. You can iterate over this set to access each key-value pair in the map.

SO,
Iteration: for (Map.Entry<Integer, Integer> entry : map.entrySet())

This loop iterates over each Map.Entry object in the entrySet of the map.
*/

//Look at this code as well
/*
class Solution {
    int maxRepeating(int k, int[] arr) {
        
        int maxValue = Arrays.stream(arr).max().orElse(Integer.MIN_VALUE);
        
       int[] store = new int[maxValue+1]; 
 

        //store the arr at the index of store
        for(int i=0;i<arr.length;i++){
            store[arr[i]]+=1;
        }
        //return the number that repeated max and small
        int max=Integer.MIN_VALUE;
        int maxIndex=-1;
        
        for(int i=0;i<store.length;i++){
            if(store[i]>max){
                max=store[i];
                maxIndex=i;
            }
        }
        
        return maxIndex;
    }
}
// Time Complexity: O(n + m)
// Space Complexity: O(m)
*/
