class Solution {
    public int minimumOperations(String num) {
        int ans=num.length();
        int n=num.length();
        int cur=0,zcnt=0;
        ans=Math.min(ans,check(num,0,0));
        ans=Math.min(ans,check(num,2,5));
        ans=Math.min(ans,check(num,5,0));
        ans=Math.min(ans,check(num,7,5));
        for(int i=0;i<n;i++){
            cur=num.charAt(i)-'0';
            if(cur==0){
                zcnt++;
            }
        }
        return Math.min(ans,n-zcnt);
    }
    public int check(String num,int d1,int d2){
        boolean d2found=false;
        int n=num.length();
        for(int i=n-1;i>=0;i--){
            int cur=num.charAt(i)-'0';
            if(cur==d2 && d2found==false){
                d2found=true;
            }else if(cur==d1 && d2found==true){
                return n-(i+2);
            }
        }
        return n;
    }
}