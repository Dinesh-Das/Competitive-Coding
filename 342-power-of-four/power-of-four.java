class Solution {
    public boolean isPowerOfFour(int n) {
        boolean res=false;
        if((n & (n-1)) == 0){
            res=true;
        }
        return res && (n%3 == 1);
    }
}