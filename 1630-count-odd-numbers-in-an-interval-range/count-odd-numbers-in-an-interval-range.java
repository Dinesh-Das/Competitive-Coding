class Solution {
    public int countOdds(int low, int high) {
       int total=high-low+1;
       if(total%2==0){
           return total/2;
       }
       return total/2+high%2;
    }
}