class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int res=-1;
        for(int i=1;i<nums.length;i+=3){
            if(nums[i-1] != nums[i]  &&  nums[i]==nums[i+1]){
                res=nums[i-1];
                break;
            }else if(nums[i-1]==nums[i]  && nums[i] !=nums[i+1]){
                res=nums[i+1];
                break;
            }
        }
        if(res==-1)res=nums[nums.length-1];
        return res;
    }
}