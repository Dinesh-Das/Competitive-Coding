class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer,Integer> map = new TreeMap<>(Collections.reverseOrder());
        int[] res=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int idx=0;
        while(map.size()!=0){
            int freq=Integer.MAX_VALUE,val=0;
            for(Map.Entry<Integer,Integer> entry: map.entrySet()){
                if(entry.getValue() < freq){
                    freq=entry.getValue();
                    val=entry.getKey();
                }
            }
            map.remove(val);
            while(freq>0){
                res[idx++]=val;
                freq--;
            }
        }
        return res;
    }
}