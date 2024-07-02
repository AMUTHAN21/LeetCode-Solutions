class Solution 
{
    public int islandPerimeter(int[][] grid) 
    {
        int n=grid.length;
        int peri=0;
        int up,down,keft,right;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {
                    peri+=4;
                    if(i>0&&grid[i-1][j]==1)
                    {
                        peri-=2;
                    }
                    if(j>0&&grid[i][j-1]==1)
                    {
                        peri-=2;
                    }
                }
            }
        }  
        return peri; 
    }
}