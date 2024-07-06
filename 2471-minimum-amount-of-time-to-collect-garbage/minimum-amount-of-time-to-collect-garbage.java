class Solution 
{
    public int garbageCollection(String[] garbage, int[] travel) 
    {
        int toR = 0;
        int metal = 0;
        int paper = 0; 
        int glass = 0;
        for (int i = 0; i < garbage.length; i++) 
        {
            toR += garbage[i].length();
            if (garbage[i].contains("M")) 
            {
                metal = i;
            }
            if (garbage[i].contains("P")) 
            {
                paper = i;
            }
            if (garbage[i].contains("G"))
            {
                glass = i;
            }
        }

        for (int i = 0; i < travel.length; i++) 
        {
            if (metal > i)
            {
                toR += travel[i];
            }
            if (paper > i) 
            {
                toR += travel[i];
            }
            if (glass > i) 
            {
                toR += travel[i];
            }
        }

        return toR;
    }
}