class Solution {
    static int majorityElement(int arr[]) {
        // your code here
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(!map.containsKey(arr[i])) map.put(arr[i],1);
            else    map.put(arr[i],map.get(arr[i])+1);
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet())
        {
            if(entry.getValue()>(arr.length/2))   return entry.getKey();
        }
        return -1;
    }
}
//Time Complexity: O(N), as we traverse the array once and then the map.Space Complexity: O(N), as we store frequencies in a HashMap.

/*
Brute Force Time Complexity: 
𝑂
(𝑁^2), as we check the count of each element by traversing the array for every element.
Space Complexity: 
𝑂(1) as no extra space is used.
*/
