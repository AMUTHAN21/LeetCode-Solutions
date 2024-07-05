class Solution 
{
    public int minimumPushes(String word) 
    {
        int n=word.length();
        if(n<=8){
            return n;     
        }
        if(n>8&&n<16){
            int a=n%8;
            n=n-a;
            int res=n*1+a*2;
            return res;
        }
        if(n==16){
            return 8*1+8*2;
        }
        if(n>16&&n<24){
            int ans=n%16;
            n=n-ans;
            return 8*1+8*2+ans*3;
        }
        if(n==24){
            return 8*1+8*2+8*3;
        }
        if(n==26){
            return 8*1+8*2+8*3+2*4;
        }
        if(n>24&&n<26){
            int ans=n%24;
            n=n-ans;
            return 8*1+8*2+8*3+ans*4;
        }
            return 0;
    }
}