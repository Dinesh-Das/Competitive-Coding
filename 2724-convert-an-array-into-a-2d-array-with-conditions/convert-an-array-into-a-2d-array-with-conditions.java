class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int val:nums){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        System.out.println(map);
        List<Integer> l=new ArrayList<>();
        while(map.size()!=0){
            List<Integer> ans= new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                if(map.containsKey(nums[i])){
                    if(!ans.contains(nums[i])){
                    ans.add(nums[i]);
                    if(map.get(nums[i])==1)
                        map.remove(nums[i]);
                    else
                        map.put(nums[i],map.get(nums[i])-1);   
                    }
                }
            }
            list.add(ans);
        }
        return list;
    }
}