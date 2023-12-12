class Solution {
    public int maxProduct(int[] nums) {
        int i=0,j=1,max=0;
        while(i<nums.length-1){
            if(j==nums.length){
                i++;
                j=i+1;
            }else{
                int cur=(nums[i]-1)*(nums[j]-1);
                if(max < cur) max=cur;
                j++;
            }
        }
        return max;
    }
}