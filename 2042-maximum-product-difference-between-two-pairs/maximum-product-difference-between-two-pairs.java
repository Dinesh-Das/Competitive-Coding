class Solution {
    public int maxProductDifference(int[] nums) {
        int a,b,c,d;
        a=b=Integer.MIN_VALUE;
        c=d=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > a){
                b=a;
                a=nums[i];
            }else if(nums[i] > b){
                b=nums[i];
            }
            if(nums[i] < c){
                d=c;
                c=nums[i];
            }else if(nums[i] < d){
                d=nums[i];
            }
        }
        return a*b -c*d;
        
    }
}