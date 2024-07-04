class Solution 
{
    public int minTimeToVisitAllPoints(int[][] points) 
    {
        int sum=0;
        for(int i=0;i<=points.length-2;i++)
        {
            // for(int j=0;j<points.length-2;j++)
            // {
                int abs1=Math.abs(points[i+1][0]-points[i][0]);
                int abs2=Math.abs(points[i+1][1]-points[i][1]);
                int ans=Math.max(abs1,abs2);
                sum+=ans;
            //}
        }
        return sum;
    }
}