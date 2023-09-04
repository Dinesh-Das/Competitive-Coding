class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() > haystack.length()) return -1;
        int i=0,j=0,idx=-1;
        while(i<haystack.length() && j<needle.length())
        {
            if(j+i < haystack.length() && needle.charAt(j)==haystack.charAt(i+j))
            {
                if(idx==-1) idx=i;
                j++;
            }else{
                idx=-1;
                j=0;
                i++;
            }
        }
        return idx;
    }
}