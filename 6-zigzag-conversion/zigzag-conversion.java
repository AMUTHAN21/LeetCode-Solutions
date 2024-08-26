class Solution 
{
    public String convert(String s, int numRows) 
    {
        String ans[][]=new String[numRows][s.length()];
        int row=0;
        int col=0;
        int cur=0;
        while(row<numRows && cur<s.length())
        {
            while(row<numRows && cur<s.length())
            {
                String temp="";
                temp+=s.charAt(cur++);
                ans[row++][col]=temp;
            }
            row=Math.max(0,row-2);
            while(row>0 && cur<s.length())
            {
                String temp1="";
                temp1+=s.charAt(cur++);
                ans[row--][++col]=temp1;
            }
            col++;
        }    
        String res="";
        for(int i=0;i<numRows;i++)
        {
            for(int j=0;j<s.length();j++)
            {
                if(ans[i][j]!=null)
                    res+=ans[i][j];
            }
        }
        return res;
    }
}