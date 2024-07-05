class Solution 
{
    public String sortVowels(String s) 
    {
        int n = s.length();
        String vowels = "";
        for (int i = 0; i < n; i++) 
        {
            if (isVowel(s.charAt(i))) 
            {
                vowels += s.charAt(i);
            }
        }
        char[] vowelArray = vowels.toCharArray();
        Arrays.sort(vowelArray);
        char[] resultArray = s.toCharArray();
        int j = 0;
        for (int i = 0; i < n; i++) 
        {
            if (isVowel(resultArray[i])) 
            {
                resultArray[i] = vowelArray[j++];
            }
        }
        return new String(resultArray);
    }
    public boolean isVowel(char c) 
    {
        return c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U';
    }
} 

