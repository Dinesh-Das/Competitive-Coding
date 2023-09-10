class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> map= new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            if(map.containsKey(magazine.charAt(i))){
                map.put(magazine.charAt(i),map.get(magazine.charAt(i))+1);
            }else{
                map.put(magazine.charAt(i),1);
            }
        }
        for(int i=0;i<ransomNote.length();i++){
            int current=map.getOrDefault(ransomNote.charAt(i),0);
            if(current==0){
                return false;
            }
            map.put(ransomNote.charAt(i),current-1);
        }
        return true;
    }
}