class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] ar= new int[nums.length];
        int x=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                ar[x++]=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==1){
                ar[x++]=nums[i];
            }
        }
        return ar;
    }
}