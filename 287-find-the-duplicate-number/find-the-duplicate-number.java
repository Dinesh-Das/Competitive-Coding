class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        while(i < nums.length)
        {
            if(nums[i]!=i+1){
                int cor=nums[i]-1;
                if(nums[i]!=nums[cor]){
                    int tmp=nums[i];
                    nums[i]=nums[cor];
                    nums[cor]=tmp;
                }else{
                    return nums[i];
                }
            }else{
                i++;
            }
        }
        return-1;
    }
}