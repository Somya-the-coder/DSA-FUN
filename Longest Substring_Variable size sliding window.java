//variable window sliding window - prev to it quickly do fixed size window qs & come
//rem bef expl sliding bhoi asked me to try on self bruteforce-u've came from there...roots give jish with goosebumps...he did with me LL as well...thank you
class Solution {
    public int lengthOfLongestSubstring(String s) {
       Map<Character,Integer> map=new HashMap<>();
       int i=0,j=0,max=0;
       while(j<s.length())//sliding window has a pattern
       {
        char ch=s.charAt(j);
        map.put(ch,map.getOrDefault(ch,0)+1);
        if(map.size()==j-i+1)
        {
            max=Math.max(max,j-i+1);
            j++;
        }
        else if(map.size()<j-i+1)//means a letter is repeated
        {
            while(map.size()<j-i+1)//till where repeated- remove and begin from just next- max m stored hai so no tension-kya pata wo hi max ho
            {
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
                if(map.get(s.charAt(i))==0)//kaash automatic jiska freq 0 ho jaata wo map se remove ho jaata
                {
                    map.remove(s.charAt(i));
                }
                i++;
            }
            j++;//...after this line again to this line...while(j<s.length())
        }
       }
       return max;
    }
}
 

//  //practice-
// int i=0,j=0,max=0;;
// Map<Character,Integer> map=new HashMap<>();
// while(j<s.length())
// {
//     char c=s.charAt(j);
//     map.put(c,map.getOrDefault(c,0)+1);//put(key,value)
//     if(map.size()==j-i+1)
//     {
//         max=Math.max(max,j-i+1);
//         j++;
//     }
//     else if(map.size()<j-i+1)//means a letter is repeated
//     {
//         while(map.size()<j-i+1)//+1 bcz of array indexing is 0-4 but length is 5
//         {
//             map.put(s.charAt(i),map.get(s.charAt(i))-1);
//             if(map.get(s.charAt(i))==0)//increment 'i' until repeated elt is removed from the set
//                 map.remove(s.charAt(i));
//             i++;
//         }
//         j++;
//     }
// }
// return max;
//     }
// }
