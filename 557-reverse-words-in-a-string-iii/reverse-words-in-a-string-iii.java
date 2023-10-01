class Solution {
    public String reverseWords(String s) {
        String[] words=s.split(" ");
        StringBuilder reversed = new StringBuilder();
        for(int i=0;i<words.length;i++){
            StringBuilder sb = new StringBuilder(words[i]);
            reversed.append(sb.reverse()+ " "); 
        }
        return reversed.toString().trim();
        
    }
}