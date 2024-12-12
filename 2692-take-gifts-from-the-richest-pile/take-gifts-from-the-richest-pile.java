import java.lang.Math;
class Solution {
    public long pickGifts(int[] gifts, int k) {
        if(gifts.length ==0) return 0;
        int n=gifts.length-1;
        Arrays.sort(gifts);
        System.out.println(Arrays.toString(gifts));
        for(long i=0;i<k;i++){
            gifts[n]=(int)Math.sqrt(gifts[n]);
            Arrays.sort(gifts);
        }
        long res=0;
        for(long val:gifts) res+=val;
        return res;
    }
}