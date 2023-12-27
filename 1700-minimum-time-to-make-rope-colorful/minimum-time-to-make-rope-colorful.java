class Solution {
    public int minCost(String s, int[] cost) {
        
       StringBuilder sb = new StringBuilder(s);
        
        ArrayList<Integer> cst = new ArrayList<>();
        for(int i : cost){
            cst.add(i);
        }
        
        int total = 0;
        int i = s.length()-1;
        while(i > 0){
            
            if(sb.charAt(i) == sb.charAt(i-1)){
                
                int min = Math.min(cst.get(i) , cst.get(i-1));
                total += min;
                if(min == cst.get(i)){
                    cst.remove(i);
                    sb.deleteCharAt(i);
                }else{
                    cst.remove(i-1);
                    sb.deleteCharAt(i);
                }
            }
            
            i--;
            
        }
    
        return total;
        
    }
}