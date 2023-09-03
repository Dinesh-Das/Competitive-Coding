class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0,j=0;
        String merge="";
        while(i<word1.length() && j<word2.length()){
            merge+=word1.charAt(i++)+""+word2.charAt(j++);
        }
        while(i<word1.length()) merge+=word1.charAt(i++);
        while(j<word2.length()) merge+=word2.charAt(j++);
        return merge;
    }
}