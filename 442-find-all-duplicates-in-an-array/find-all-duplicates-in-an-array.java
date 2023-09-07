class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for(int val:nums){
            if(!map.containsKey(val)){
                map.put(val,1);
            }else{
                res.add(val);
            }
        }
        return res;
    }
}