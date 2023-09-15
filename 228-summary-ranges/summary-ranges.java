class Solution {
    public List<String> summaryRanges(int[] nums) {
        if(nums.length==0)return new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]-nums[i]==1){
                if(sb.length() > 2 && sb.charAt(sb.length()-1)=='>') continue;
                sb.append(nums[i]);
                sb.append("->");
            }else{
                sb.append(nums[i]);
                sb.append(",");
            }
        }
        sb.append(nums[nums.length-1]);
        return Arrays.asList(sb.toString().split(",")); 
    }
}