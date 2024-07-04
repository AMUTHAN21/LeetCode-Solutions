class Solution 
{
    public boolean digitCount(String num) 
    {
       HashMap<Integer,Integer> mp=new HashMap<>();
       int n=num.length();
       for(int i=0;i<n;i++)
       {
        int ch=num.charAt(i)-'0';
        mp.put(ch,mp.getOrDefault(ch,0)+1);
       }      
       int count=0;
       for(int i=0;i<n;i++)
       {
        if(mp.containsKey(i))
        {
            count=mp.get(i);
        }
        else
        {
            count=0;
        }
        int x=num.charAt(i)-'0';
        if(x!=count)
        {
            return false;
        }
       }
       return true;
    }
}