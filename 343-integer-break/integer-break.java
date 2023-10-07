class Solution {
    public int integerBreak(int n) {
        int[] dp = new int[n+2];
        dp[1]=1;
        dp[2]=1;
        dp[3]=2;
        for(int i=4;i<=n;i++){
            int num=i;
            for(int j=1;j<=num;j++){
                int x=j;
                int y=num-x;
                dp[i]=Math.max(dp[i],Math.max(x*y,Math.max(dp[x]*y,Math.max(x*dp[y],dp[x]*dp[y]))));
            }
        }
        return dp[n];
    }
}