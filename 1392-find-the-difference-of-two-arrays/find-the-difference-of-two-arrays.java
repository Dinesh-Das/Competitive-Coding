class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();
        List<List<Integer>> result= new ArrayList<>();
        for(int val:nums1){
            s1.add(val);
        }
        for(int val:nums2){
            s2.add(val);
        }
        List<Integer> list= new ArrayList<>();
        for(int val:nums1){
            if(s1.contains(val) && s2.contains(val) ){
                continue;
            }else{
                if(!list.contains(val)){
                    list.add(val);
                }
            }
        }
        result.add(list);
        list=new ArrayList<>();
        for(int val:nums2){
            if(s1.contains(val) && s2.contains(val) ){
                continue;
            }else{
                if(!list.contains(val)){
                    list.add(val);
                }
            }
        }
        result.add(list);
        return result;       
    }
}