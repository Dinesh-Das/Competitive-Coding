class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        List<List<Integer>> a= new ArrayList<>();
        List<Integer> b= new ArrayList<>();
        int cnt=0;
        for(int i=0;i<nums.length-2;i+=3){
            if(nums[i+2]-nums[i+1] <=k && nums[i+1]-nums[i] <=k && nums[i+2] -nums[i] <=k){
                b.add(nums[i]);
                b.add(nums[i+1]);
                b.add(nums[i+2]);
                cnt+=b.size();
                a.add(b);
                b=new ArrayList<>();
            }
            
        }
        System.out.println(a);
        if(nums.length != cnt){
            return new int[][]{};
        }
        int[][] res= new int[a.size()][a.get(0).size()];
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[i].length;j++){
                res[i][j]=a.get(i).get(j);
            }
        }
        return res;
    }
}