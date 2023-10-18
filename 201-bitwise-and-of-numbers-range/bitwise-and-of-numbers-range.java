class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        if(left==right){
            return right;
        }
        if(right-left >=1){
            int ans=0+(rangeBitwiseAnd(left >> 1,right >>1) <<1);
            return ans;
        }
        return 0;
        
    }
}