class Solution {
    public int longestStrChain(String[] words) {
        Arrays.sort(words,(s1,s2) -> Integer.compare(s1.length(),s2.length()));
        Map<String,Integer> map = new HashMap<>();
        int res=0;
        for(String word:words){
            int longest=0;
            for(int i=0;i<word.length();i++){
                StringBuilder sb= new StringBuilder(word);
                sb.deleteCharAt(i);
                String subStr = sb.toString();
                longest=Math.max(longest,map.getOrDefault(subStr,0)+1);
            }
            map.put(word,longest);
            res=Math.max(res,longest);
        }
        
        return res;
    }
}