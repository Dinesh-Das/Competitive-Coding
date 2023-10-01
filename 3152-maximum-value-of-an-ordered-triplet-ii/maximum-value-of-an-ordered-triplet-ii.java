class Solution {
    public long maximumTripletValue(int[] nums) {
        long ans=0,sub=0,last=0;
        for(int val:nums){
            ans= Math.max(ans,1L * sub * val);
            sub= Math.max(sub,last - val);
            last= Math.max(last,val);
        }
        return ans;
    }
}