class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        boolean[] res = new boolean[queries.length];
        int[] sub=new int[nums.length];
        sub[0]=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]%2 == nums[i-1]%2){
                sub[i]=sub[i-1]+1;
            }else{
                sub[i]=sub[i-1];
            }   
        }
        for(int i=0;i < queries.length;i++){
            if(sub[queries[i][0]] == sub[queries[i][1]]){
                res[i]=true;
            }else{
                res[i]=false;
            }
        }
        return res;
    }
}