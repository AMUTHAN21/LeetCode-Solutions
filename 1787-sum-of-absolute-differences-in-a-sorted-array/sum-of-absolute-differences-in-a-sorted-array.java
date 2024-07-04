class Solution 
{
    public int[] getSumAbsoluteDifferences(int[] nums) 
    {
        int n=nums.length;
        int res[]=new int[n];
        int prefsum[]=new int[n];
        for(int i=0;i<n;i++)
        {
            if(i==0)
            {
                prefsum[i]=nums[i];
            }
            else
            {
                prefsum[i]=prefsum[i-1]+nums[i];
            }
        }
        for(int i=0;i<n;i++)
        {
           int cnum=nums[i];
           int lsum=cnum*(i+1)-prefsum[i];
           int rsum=(prefsum[n-1]-prefsum[i]-(n-1-i)*cnum);
           res[i]=lsum+rsum; 
        }   
        return res;
    }
}