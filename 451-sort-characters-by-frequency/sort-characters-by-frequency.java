class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map = new TreeMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        StringBuilder sb= new StringBuilder();
        int freq=0;
        char ch=' ';
        while(map.size() !=0 ){
            for(Map.Entry<Character,Integer> entry : map.entrySet()){
                if(entry.getValue() > freq){
                    freq=entry.getValue();
                    ch=entry.getKey();
                }
            }
            while(freq > 0){
                sb.append(ch);
                freq--;
            }   
            map.remove(ch);
        }
        return sb.toString();
    }
}