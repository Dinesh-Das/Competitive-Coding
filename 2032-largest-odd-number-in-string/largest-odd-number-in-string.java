class Solution {
    public String largestOddNumber(String num) {
        int i;
        for(i=num.length()-1;i>=0;i--){
          int cur=num.charAt(i)-'0';
          if(cur%2==1)break;
        }
        return num.substring(0,i+1);
    }
}