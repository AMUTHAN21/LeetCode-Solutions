class Solution 
{
    public int countSeniors(String[] details) 
    {
        int c=0;
        
        for(int i=0;i<details.length;i++)
        {
            String a="";
            String str=details[i];
            for(int j=0;j<str.length();j++)
            {
                char m=str.charAt(11);
                a+=m;
                char b=str.charAt(12);
                a+=b;
                break;
            }
            int m=Integer.parseInt(a);
            if(m>60)
            {
                c++;
            }
        }    
        
        return c;
    }
}