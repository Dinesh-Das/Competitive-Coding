class Solution {
    public int singleNonDuplicate(int[] nums) {
       int left,right;
       for(int i=0;i<nums.length;i++){
           left=binarySearch(nums,0,i-1,nums[i]);
           right=binarySearch(nums,i+1,nums.length-1,nums[i]);
           if(left == -1 && right == -1){
               return nums[i];
           }
       }
       return -1;
    }
    public int binarySearch(int[] nums, int s,int e,int target){
        if(s+1 == nums.length) return -1;
        while(s <= e){
            int m=s+(e-s)/2;
            if(nums[m]==target){
                return m;
            }else if (nums[m] > target){
                e=m-1;
            }else{
                s=m+1;
            }
        }
        return -1;
    }
}