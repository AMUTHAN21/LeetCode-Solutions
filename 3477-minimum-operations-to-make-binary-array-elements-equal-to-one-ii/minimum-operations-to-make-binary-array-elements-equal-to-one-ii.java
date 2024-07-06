class Solution 
{
    public int minOperations(int[] nums) 
    {
        int res = 0;
        boolean zero = false;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0 && zero== false)
            {
                zero= true;
            }
            else if(nums[i] == 1 && zero== true)
            {
                res += 2;
                zero= false;
            }
        }

        if(nums[nums.length-1] == 0){
            res++;
        }
            
        return res;
    }
}