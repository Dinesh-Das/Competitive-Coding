class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> res = new ArrayList<>();
        for(int val:nums){
            if(!set.contains(val)){
                set.add(val);
            }else{
                res.add(val);
            }
        }
        return res;
    }
}