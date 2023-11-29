class Solution {
    public int[] countBits(int n) {
        int[] res=new int[n+1];
        for(int i=0;i<=n;i++){
            res[i]=count(i);
        }
        return res;
    }
    public int count(int n){
        int cnt=0;
        for(int i=0;i<32;i++){
            if((n&1)==1)cnt++;
            n>>=1;
        }
        return cnt;
    }
}