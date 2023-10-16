class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int pre=1,post=1;
        int i=0,j=1;
        while(i<nums.length-1){
            if(j==nums.length){
                if(nums[i]==0) {
                    post=1; 
                    for(int x=i+1;x<nums.length;x++) post*=nums[x];
                }
                prefix[i]=pre * post;
                pre=pre*nums[i];
                i++;
                post=nums[i]==0?0:post/nums[i];
            }else{
                post*=nums[j++];
            
            }
        }
        prefix[i]=pre;
        return prefix;
    }
}
