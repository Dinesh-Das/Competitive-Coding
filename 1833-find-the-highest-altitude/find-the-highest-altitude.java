class Solution {
    public int largestAltitude(int[] gain) {
        int max=0,cur=0;
        for(int val:gain){
            cur+=val;
            if(max < cur){
                max=cur;
            }
        }
        return max;
    }
}