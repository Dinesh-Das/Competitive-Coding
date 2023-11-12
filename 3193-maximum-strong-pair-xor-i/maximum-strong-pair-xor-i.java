class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(Math.abs(nums[i]-nums[j]) <= Math.min(nums[i],nums[j])){
                    int xor=nums[i] ^ nums[j];
                    if(max < xor){
                        max=xor;
                    }
                }
            }
        }
        return max;
        
    }
}