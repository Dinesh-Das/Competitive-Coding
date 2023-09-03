class Solution {
    public int[] sortedSquares(int[] nums) {
        int x=nums.length -1;
        int[] ar = new int[nums.length];
        int l=0,r=x;
        while(l<=r)
        {
            if(Math.abs(nums[l]) < Math.abs(nums[r]))
            {
                ar[x--]=nums[r]*nums[r];
                r--;
            }else{
                ar[x--]=nums[l]*nums[l];
                l++;
            }
        }
        return ar;
    }

}