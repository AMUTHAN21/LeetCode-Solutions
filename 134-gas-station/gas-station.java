class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) 
    {
        int total_left=0;
        for(int i=0;i<gas.length;i++)
        {
            total_left+=gas[i]-cost[i];
        }    
        if(total_left<0)
        {
            return -1;
        }

        int stidx=0;
        int remaining=0;
        for(int i=0;i<gas.length;i++)
        {
            int currentgas=gas[i]+remaining;
            int currentcost=cost[i];
            remaining=currentgas-currentcost;
            if(remaining<0)
            {
                remaining=0;
                stidx=i+1;
            }
        }
        return  stidx;
    }
}