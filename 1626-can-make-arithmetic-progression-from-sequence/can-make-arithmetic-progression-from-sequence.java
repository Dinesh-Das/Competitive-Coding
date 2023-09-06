class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int n=arr.length;
        for(int val:arr){
            if(val<min){
                min=val;
            }
            if(val>max){
                max=val;
            }
        }
        if(max-min==0){
            return true;
        }
        if((max-min)%(n-1)!=0){
            return false;
        }
        int diff=(max-min)/(n-1);
        Set<Integer> set= new HashSet<>();
        for(int val:arr){
            if((val-min) % diff != 0){
                return false;
            }
            set.add(val);
        }
        return set.size()==n;
    }
}