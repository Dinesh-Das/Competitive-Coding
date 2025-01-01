class Solution {
    public int maxScore(String s) {
        int maxScore=Integer.MIN_VALUE;
        for(int i=1;i<s.length();i++){
            int cur=countZero(s.substring(0,i)) + countOne(s.substring(i,s.length()));
            // System.out.println(countZero(s.substring(0,i)) +" + "+ countOne(s.substring(i,s.length())));
            maxScore=Math.max(maxScore,cur);
        }
        return maxScore;
    }
    public int countZero(String s){
        int zero=0;
        for(char ch : s.toCharArray()) if (ch == '0') zero++;
        return zero;
    }
    public int countOne(String s){
        int one=0;
        for(char ch : s.toCharArray()) if (ch == '1') one++;
        return one;
    }
}