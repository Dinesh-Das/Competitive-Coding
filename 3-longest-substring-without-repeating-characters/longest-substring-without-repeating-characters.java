class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<String> sub = new HashSet<>();
        String tmp="";
        int i=0,n=s.length(),k=0;
        while(i<n){
            if(i<n && tmp.indexOf(s.charAt(i)) ==-1){
                tmp+=s.charAt(i);
                i++;
            }else{
                sub.add(tmp);
                tmp="";
                k++;
                i=k;
            }
        }
        sub.add(tmp);
        int max=0;
        for(String st:sub){
            if(max < st.length()) max=st.length();
        }
        return max;        
    }
}