class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int cnt=0;
        int i=s.length()-1;
        while(i>=0){
            if(s.charAt(i)!=' '){
                cnt++;
            }else{
                break;
            }
            i--;
        }
        return cnt;
        
    }
}