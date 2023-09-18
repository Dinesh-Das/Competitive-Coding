class Solution {
    public int countWays(List<Integer> nums) {
        int result=0;
        Collections.sort(nums);
        for(int i=0;i<nums.size();i++){
            if((nums.get(i) <  i+1) && (i+1 < nums.size() && nums.get(i+1) > i+1) ){
                result++;
            }else if( nums.get(i) < i+1 && i+1==nums.size() ){
                result++;
            }
        }
        if(nums.get(0) > 0) result++;
        return result;
    }
}