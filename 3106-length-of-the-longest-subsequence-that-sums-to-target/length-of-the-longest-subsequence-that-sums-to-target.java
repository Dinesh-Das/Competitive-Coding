class Solution {
    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {
        int n=nums.size();
        List<Integer> dp=new ArrayList<>(Collections.nCopies(target+1,-1));
        dp.set(0,0);
        for(int num:nums){
            for(int sum = target;sum>=num;sum--){
                if(dp.get(sum-num) != -1){
                    dp.set(sum,Math.max(dp.get(sum),dp.get(sum-num)+1));
                }
            }
        }
        return dp.get(target);
    }
}