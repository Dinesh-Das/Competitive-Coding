class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n=s.length();
        for(int i=1;i<n;i++){
            String sub=s.substring(0,i);
            int times = n/sub.length();
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<times;j++) sb.append(sub);
            if(sb.toString().equals(s)) return true;
        }
        return false;
    }
}