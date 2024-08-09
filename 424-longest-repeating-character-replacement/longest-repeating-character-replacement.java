class Solution 
{
    public int characterReplacement(String s, int k) 
    {
        int occurence[]=new int[26];
        int l=0;
        int ans=0;
        int maxoccurence=0;

        for(int r=0;r<s.length();r++)
        {
            maxoccurence=Math.max(maxoccurence,++occurence[s.charAt(r)-'A']);
            if(r-l+1-maxoccurence>k)
            {
                occurence[s.charAt(l)-'A']--;
                l++;
            }
            ans=Math.max(ans,r-l+1);
        }   
        return ans;
    }
}