class Solution 
{
    public String makeSmallestPalindrome(String s) 
    {
        int n=s.length();
        char ar[]=new char[n];
        String str="";
        for(int i=0;i<=n/2;i++)
        {
            if(s.charAt(i)!=s.charAt(n-i-1))
            {
                int as1=s.charAt(i);
                int as2=s.charAt(n-i-1);
                if(as1<as2)
                {
                    ar[n-i-1]=s.charAt(i);
                    ar[i]=s.charAt(i);
                }
                else
                {
                    ar[i]=s.charAt(n-i-1);
                    ar[n-i-1]=s.charAt(n-i-1);
                }
            }
            else
            {
                ar[i]=s.charAt(i);
                ar[n-i-1]=s.charAt(n-i-1);
            }
        }
        for(int i=0;i<ar.length;i++)
        {
            str=str+ar[i];
        }
        return str;
    }
}