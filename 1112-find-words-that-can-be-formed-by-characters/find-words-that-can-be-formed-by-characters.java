class Solution {
    public int countCharacters(String[] words, String chars) {
        int res=0;
        Map<Character,Integer> freq = new HashMap<>();
        for(int i=0;i<chars.length();i++) freq.put(chars.charAt(i),freq.getOrDefault(chars.charAt(i),0)+1);
        for(int i=0;i<words.length;i++){
            Map<Character,Integer> dummy= new HashMap<>(freq);
            int j=0;
            while(j<words[i].length()){
                if(dummy.containsKey(words[i].charAt(j)) && dummy.get(words[i].charAt(j)) > 0){
                    dummy.put(words[i].charAt(j), dummy.get(words[i].charAt(j)) -1);
                }else{
                    break;
                }
                j++;
            }
            if(j == words[i].length()){
                res+=j;
            }
        }
        return res;
    }
}