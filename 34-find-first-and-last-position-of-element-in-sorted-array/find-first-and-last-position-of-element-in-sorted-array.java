class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{binarySearch(nums,target,true),binarySearch(nums,target,false)};
    }
    public int binarySearch(int[] nums,int target,boolean isFirst){
        int s=0;
        int e=nums.length-1;
        int idx=-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(nums[m] < target){
                s=m+1;
            }else if(nums[m] > target){
                e=m-1;
            }else{
                idx=m;
                if(isFirst){
                    e=m-1;
                }else{
                    s=m+1;
                }
            }

        }
        return idx;
    }
}