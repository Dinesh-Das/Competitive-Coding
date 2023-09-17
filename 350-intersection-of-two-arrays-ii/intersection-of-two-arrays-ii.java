class Solution {
    public Map<Integer,Integer> fillMap(int[] nums){
        Map<Integer,Integer> map= new HashMap<>();
        for(int val:nums) {
            if(map.containsKey(val)){
                map.put(val,map.get(val)+1);
            }else{
                map.put(val,1);
            }
        }
        return map;
    }
    public int[] intersect(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        Map<Integer,Integer> a= fillMap(nums1);
        Map<Integer,Integer> b= fillMap(nums2);
        List<Integer> list=new ArrayList();
        if(n>m){
            list=isInMap(a,nums2);
        }else if(n < m){
            list=isInMap(b,nums1);
        }else{
            list=compareTwoEqualList(nums1,nums2);
        }
        int[] res=new int[list.size()];
        for(int i=0;i<list.size();i++) res[i]=list.get(i);
        return res;
    }
    public List<Integer> compareTwoEqualList(int[] a, int[] b){
       List<Integer> x= new ArrayList<>();
       for(int val:a){
           x.add(val);
       }
       List<Integer> res=new ArrayList<>();
       for(int val:b){
           if(x.contains(val)){
               res.add(val);
               x.remove(x.indexOf(val));
           }
       }
       return res;
    }
    public List<Integer> isInMap(Map<Integer,Integer> map, int[]nums){
        List<Integer> list= new ArrayList<>();
        for(int val:nums){
            if(map.containsKey(val)){
                if(map.get(val) > 0){
                    map.put(val,map.get(val)-1);
                    list.add(val);
                }
            }
        }
        return list;
    }

}