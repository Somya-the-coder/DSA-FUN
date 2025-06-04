Class Solution {
    public void reverseString(char[] s) {

      //in-place reversal
    int n=s.length;
    for(int i=0;i<n/2;i++)
    {
        char temp=s[i];
        s[i]=s[n-i-1];
        s[n-i-1]=temp;
    }
      //space taking dev sir reversal technique
    //     String s1="";
    //     for(char i:s)
    //     {
    //         s1=i+s1;
    //     }
    //     System.out.println(s1);
    }
}
