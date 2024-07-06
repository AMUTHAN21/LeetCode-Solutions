class Solution 
{
    public int minOperations(int[] nums) 
    {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<=n-3;i++)
        {
            if(nums[i]==0)
            {
                nums[i]=1-nums[i];
                nums[i+1]=1-nums[i+1];
                nums[i+2]=1-nums[i+2];
                sum++;
            }   
        }
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0)
            {
                return -1;
            }
        } 
        return sum;
    }
}