class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> ransom = new HashMap<>();
        HashMap<Character,Integer> mag=new HashMap<>();
        for(char ch:ransomNote.toCharArray()){
            if(ransom.containsKey(ch)){
                ransom.put(ch,ransom.get(ch)+1);
            }else{
                ransom.put(ch,1);
            }
        }
        for(char ch:magazine.toCharArray()){
            if(mag.containsKey(ch)){
                mag.put(ch,mag.get(ch)+1);
            }else{
                mag.put(ch,1);
            }
        }
        boolean charPresent=true;
        for(Map.Entry<Character,Integer> entry:ransom.entrySet()){
            if(mag.containsKey(entry.getKey())){
                if(mag.get(entry.getKey()) < entry.getValue()){
                    return false;
                }
            }else{
                charPresent=false;
            }
        }
        return charPresent;
    }
}