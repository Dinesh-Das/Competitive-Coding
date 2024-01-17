class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int val:arr) map.put(val,map.getOrDefault(val,0)+1);
        Map<Integer,Integer> fmap=new HashMap<>();
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(fmap.containsKey(entry.getValue())){
                return false;
            }else{
                fmap.put(entry.getValue(),entry.getKey());
            }
        }
        return true;
    }
}