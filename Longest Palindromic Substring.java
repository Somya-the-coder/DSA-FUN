class Solution {
    // Static method to find the longest palindromic substring
    static String longestPalindrome(String s) {
        //ON SEEING SUBSTRING WORD IN QS DO NOT USE SLIDING WINDOW
        //FOR THIS QS EXPAND ALONG CENTER APPROACH MAKES IT MUCH EASIER
        //for array len=a.length...for str len=s.length()..."()"this fun symbol use is necessary /*arr.length here .length is a field... In Java, a field refers to a variable that is a member of a class or an object. Fields represent the state or attributes of a class or object. They are often also called member variables or instance variables (for non-static fields).
        String res = "";
        int resLen = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            // Odd length palindrome
            int l = i, r = i;
            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                if ((r - l + 1) > resLen) {//apne kaam par focus: each time we just need the substring and length to compare
                    res = s.substring(l, r + 1);
                    resLen = r - l + 1;//window size formula = length of substring each time...last-first+1
                }
                l--;
                r++;
            }

            // Even length palindrome
            l = i;
            r = i + 1;
            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                if ((r - l + 1) > resLen) {
                    res = s.substring(l, r + 1);
                    resLen = r - l + 1;
                }
                l--;
                r++;
            }
        }

        return res;
        
// tc=O(n^2)
// sc=O(n)        
        
        
        
        
        
        
        
        
        
        // //M1: IN STRING FORMAT DO
        // //M2:CONVERT TO ARRAY AND DO
        
        
        // //we need 2 pointers ofcourse 
        // //put at 1st and last of string
        // //if i+1=j and both have same string till now(even length)
        // //if i==j and both have same string till now(odd length)
        // //leave fitscous above way check whole str from front to back and vice versa using 2 pointers
        // // its the longest palin string
        // //AND REM YOU LOVE PLAYING WITH STRINGS- ITS THE EASIEST FOR ME UNTIL A SUBSEQ(SLIDING WINDOW) comes into play 
        // int l=s.length();
        // int i=0,j=l-1;
        // String st="",st1="";
        // while(i!=l || j!=0)
        // {
        //     st=st+s.charAt(i);//st=st+s[i]...error array indexing
        //     st1=s.charAt(j)+st1;//revese order mei storing the 2nd half of string
        //     if(st.equals(st1))//st==st1...immutable...str const pool concept
        //     {
        //         return st+st1;
        //     }
        //     else if(st.equals(st1.substring(j+1)));//or convert str to arr and operate
        //         return st+
        //     i++;j--;
        // }
        // return s.substring(0,1);
    }
}
