class Solution {
    public int singleNonDuplicate(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int val:nums){
            if(map.containsKey(val)){
                map.put(val,2);
            }else{
                map.put(val,1);
            }
        }
        int res=-1;
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()==1){
                res=e.getKey();
                break;
            }
        }
        return res;
    }
}