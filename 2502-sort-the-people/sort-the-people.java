class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String> map = new TreeMap<>(Collections.reverseOrder());
        for(int i=0;i<heights.length;i++){
            map.put(heights[i],names[i]);
        }  
        int idx=0;
        for(Map.Entry<Integer,String> e: map.entrySet()){
            names[idx++]=e.getValue();
        }  
        return names;
    }
}