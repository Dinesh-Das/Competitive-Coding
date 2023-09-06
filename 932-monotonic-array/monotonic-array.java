class Solution {
    public boolean isMonotonic(int[] nums) {
        int i=0;
        while(i<nums.length-1){
            if(nums[i] <= nums[i+1]){
                i++;
                continue;
            }else{
                break;
            }
        }
        if(i==nums.length-1){
            return true;
        }
        i=0;
        while(i<nums.length-1){
            if(nums[i] >= nums[i+1]){
                i++;
                continue;
            }else{
                break;
            }
        }
        if(i==nums.length-1){
            return true;
        }
        return false;
    }
}