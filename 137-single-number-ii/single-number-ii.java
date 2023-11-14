class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map= new HashMap<>();
        for(int val:nums){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        int res=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==1)
            {
                res=entry.getKey();
                break;
            } 
        }
        return res;
    }
}