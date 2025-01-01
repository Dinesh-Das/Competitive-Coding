class Solution {
    public int maxScore(String s) {
        int max=0;
        int ones=0;
        for(char ch: s.toCharArray()) if(ch=='1') ones++;
        int zero=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='1'){
                ones--;
            }else{
                zero++;
            }
            max=Math.max(max,ones+zero);
        }
        return max;
    }
}