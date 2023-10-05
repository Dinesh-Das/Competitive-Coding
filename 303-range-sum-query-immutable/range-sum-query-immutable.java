class NumArray {
    List<Integer> list;
    public NumArray(int[] nums) {
        list=new ArrayList<>();
        for(int val:nums)list.add(val);
    }
    
    public int sumRange(int left, int right) {
        int sum=0;
        while(left<=right){
            sum+=list.get(left++);
        }
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */