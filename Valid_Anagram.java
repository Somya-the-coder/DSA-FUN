//TOPIC=HASHMAP - 
/*Use Map<String> map = new HashMap<>(); for flexibility and adherence to best practices.
Use HashMap<String, Integer> map = new HashMap<>(); for specific key-value pair types.
Avoid HashMap<String> map = new HashMap<String>(); unless you're using a pre-Java 7 version.*/

class Solution {
    public boolean isAnagram(String s, String t) {

//M1: HASHMAP OFCOURSE
        Map<Character,Integer> map=new HashMap<>();//good practice to write map(u can use a lot of functions)
        int i=0;
        for(char ch: s.toCharArray())
        {
            //or simply- mapy.put(c, mapy.getOrDefault(c,0)+1);//at 1st only 1 as freq =1 pehle na!!!
            if(!map.containsKey(ch))
            {
                map.put(ch,1);
            }
            else
            {
                map.put(ch,map.get(ch)+1);
            }
        }
        for(char ch: t.toCharArray())
        {
        if(map.containsKey(ch))
        {
            map.put(ch,map.get(ch)-1);
            if(map.get(ch)==0)
            {
                map.remove(ch);
            }
        }
        else//if different or again char comes means its extra present
        {
                return false;
        }
        }
        return map.isEmpty();
    }
}
// T.C=O(N)
// S.C=O(N)

//------------------------------------------------------------------------------------

// //M2:SORT STR-ARR-SORT(as arr can be sorted using function)-STR-.EQUALS SE COMPARE
// char s1[]=s.toCharArray();
// char t1[]=t.toCharArray();

// Arrays.sort(s1);
// Arrays.sort(t1);

// String s2=new String(s1);
// String t2=new String(t1);

// return (s2.equals(t2));
//     }
// }

// //T.C=O(nlogn)
// //S.C=O(1)

//READ INTERVIEW QUESTIONS ON HASHMAP(FROM INTERVIEWBIT)
/*        for (Map.Entry<String,String> entry : INTERVIEW_BIT.entrySet())
            System.out.println("Key = " + entry.getKey() +
                             ", Value = " + entry.getValue());
*/
