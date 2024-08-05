class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String,Integer> map= new LinkedHashMap<>();
        for(String ar:arr){
            map.put(ar,map.getOrDefault(ar,0)+1);
        }
        String res="";
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            if(entry.getValue() > 1){
                continue;
            }
            k--;
            if(k==0){
                res=entry.getKey();
            }
        }
        return res;
    }
}