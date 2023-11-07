class Solution {
    public int maxOperations(int[] nums, int k) {
        int op=0;
        Arrays.sort(nums);
        int i=0,j=nums.length-1;
        while(i<j){
            if(nums[i]+nums[j] == k){
                op++;
                i++;
                j--;
            }else if(nums[i]+nums[j] > k){
                j--;
            }else{
                i++;
            }
        }
        return op;
        
    }
    
}