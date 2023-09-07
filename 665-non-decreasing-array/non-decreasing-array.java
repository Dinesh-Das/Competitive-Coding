class Solution {
    public boolean checkPossibility(int[] nums) {
        int cnt=0;
        for(int i=1;i<nums.length;i++){
            // System.out.println(Arrays.toString(nums));
            if(nums[i] < nums[i-1]){
                cnt++;
                if(cnt>1)return false;
                if(i>=2 && nums[i-2]>nums[i]){
                    nums[i]=nums[i-1];
                }
            }
        }
        return true;
    }
}