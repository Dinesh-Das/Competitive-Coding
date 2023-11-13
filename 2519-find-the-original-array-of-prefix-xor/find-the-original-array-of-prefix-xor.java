class Solution {
    public int[] findArray(int[] pref) {
        int[] res=new int[pref.length];
        int cur=pref[0];
        res[0]=cur;
        for(int i=1;i<pref.length;i++){
            res[i]=cur ^ pref[i];
            cur=pref[i];
        }
        return res;
        
    }
}