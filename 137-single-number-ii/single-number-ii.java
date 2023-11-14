class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i+=3){
            if(nums[i-1] != nums[i]  &&  nums[i]==nums[i+1]){
                return nums[i-1];
            }else if(nums[i-1]==nums[i]  && nums[i] !=nums[i+1]){
                return nums[i+1];
            }
        }
        return nums[nums.length-1];
    }
}