class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Map<Integer,Integer> map = new TreeMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],0);
        }
        int[] ar=new int[nums.length];
        int i=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            ar[i++]=entry.getKey();
        }
        int cnt=1,max=0;
        for(i=0;i<ar.length-1;i++){
            if(ar[i+1]-ar[i] == 1){
                cnt++;
            }else{
                if(max < cnt){
                    max=cnt;
                }
                cnt=1;
            }
        } 
        if(max < cnt) max=cnt;
        return max;
    }
}