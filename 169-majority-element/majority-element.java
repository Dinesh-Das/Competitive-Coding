class Solution {
    public int majorityElement(int[] nums) {
        int c=0,v=0;
        for(int val:nums)
        {
            if(v==0)
            {
                c=val;
            }
            if(c==val) v++;
            else v--;
        }
        return c;
    }
}