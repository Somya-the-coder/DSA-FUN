class Solution {
    public boolean canMakeSubsequence(String s1, String s2) {
        int i=0,j=0; 
        if(s1.length()<s2.length())
            return false;
        while(i<s1.length() && j<s2.length())
        {
            int ss1=s1.charAt(i)-'a';
            int ss2=s2.charAt(j)-'a';
            if(ss1==ss2 || ss2==(ss1+1)%26)
                j++;
            i++;
        }
        return j==s2.length();//means all elts are checked and must have been matched
    }
}
