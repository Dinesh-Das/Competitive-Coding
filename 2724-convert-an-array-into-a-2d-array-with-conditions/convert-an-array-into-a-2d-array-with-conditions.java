class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int val:nums){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i]) >= 1){
                if(!l.contains(nums[i]))
                {
                    l.add(nums[i]);
                    map.put(nums[i],map.get(nums[i])-1);
                }
            }
            if(i == nums.length-1){
                System.out.println(l);
                list.add(l);
                l=new ArrayList<>();
                boolean hasValue=false;
                for(int val:nums){
                    if(map.get(val) > 0 ) hasValue=true;
                }
                if(hasValue) i=0;
            }
            System.out.println(map);
        }
        return list;
    }
}