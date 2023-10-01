class Solution {
    public long maximumTripletValue(int[] nums) {
        long max=0;
        int i=0,j,k;
        while(i< nums.length-2){
            j=i+1;
            while(j < nums.length-1){
                k=j+1;
                while(k<nums.length){
                    long cur=(long)(nums[i]-nums[j]) * nums[k];
                    if(max < cur) max=cur;
                    k++;
                }
                j++;
            }
            i++;
        }
        return max;
    }
}