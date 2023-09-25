class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch: s.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        char res=' ';
        for(char ch:t.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);
            }else{
                res=ch;
                break;
            }
        }
        if(res==' '){
            for(Map.Entry<Character,Integer> entry : map.entrySet()){
                if(entry.getValue() < 0){
                    res=entry.getKey();
                    break;
                }
            }
        }
        return res;
    }
}