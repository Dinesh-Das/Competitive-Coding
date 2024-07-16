class Solution {
    public int maximumSwap(int num) {
        Map<Integer,Integer> map= new HashMap<>();
        StringBuilder sb= new StringBuilder(String.valueOf(num));
        for(int i=0;i<sb.length();i++){
            map.put(Character.getNumericValue(sb.charAt(i)),i);
        }
        int left=0;
        while(left < sb.length()){
            int max=9;
            int leftVal=Character.getNumericValue(sb.charAt(left));
            while(max > leftVal){
                if(map.containsKey(max) && map.get(max) > left){
                    sb.replace(left,left+1,String.valueOf(max));
                    sb.replace(map.get(max),map.get(max)+1,String.valueOf(leftVal));
                    return Integer.parseInt(sb.toString());
                }
                max--;
            }
            left++;
        }
        return num;
    }
}