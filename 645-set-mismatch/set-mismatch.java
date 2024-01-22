class Solution {
    public int[] findErrorNums(int[] nums) {
        Set<Integer> set=new TreeSet<>();
        int[] res=new int[2];
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                res[0]=nums[i];
            }else{
                set.add(nums[i]);
            }
        }
        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i)){
                res[1]=i;
                break;
            }
        }
        return res;
    }
}