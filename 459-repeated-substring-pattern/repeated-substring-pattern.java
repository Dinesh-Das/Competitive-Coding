class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n=s.length();
        for(int i=1;i<n;i++){
            int times = n/s.substring(0,i).length();
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<times;j++) sb.append(s.substring(0,i));
            if(sb.toString().equals(s)) return true;
        }
        return false;
    }
}