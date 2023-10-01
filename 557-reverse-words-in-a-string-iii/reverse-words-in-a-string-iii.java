class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] str = s.split(" ");
        for(int i=0;i<str.length;i++){
            for(int j=str[i].length()-1;j>=0;j--){
                sb.append(str[i].charAt(j));
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}