class Solution {
    public int singleNumber(int[] nums) {
        int no=0;
        for(int val:nums) no=no^val;
        return no;
    }
}