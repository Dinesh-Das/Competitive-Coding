class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuffer res=new StringBuffer();
        int idx=0;
        for(int i=0;i<s.length();i++){
            if(idx < spaces.length && spaces[idx] == i){
                res.append(" ");
                res.append(s.charAt(i));
                idx++;
            }else{
                res.append(s.charAt(i));
            }
        }
        return res.toString();
        
    }
}