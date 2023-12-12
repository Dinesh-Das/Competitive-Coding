class Solution {
    public int maxProduct(int[] nums) {
        int max=0,i=0,j=nums.length-1;
        Arrays.sort(nums);
        while(i < j){
            if(max < ((nums[i]-1)*(nums[j]-1)) ){
                max=(nums[i]-1)*(nums[j]-1);
            }
            i++;
        }
        return max;
    }
}