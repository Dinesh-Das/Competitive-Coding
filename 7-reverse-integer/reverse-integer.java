class Solution {
    public int reverse(int x) {
        int res=0;
        while(x!=0){
            int ans=(res*10) + (x%10);
            if((ans-(x%10)) /10 != res) return 0;
            x/=10;
            res=ans;
        }
        return res;        
    }
}