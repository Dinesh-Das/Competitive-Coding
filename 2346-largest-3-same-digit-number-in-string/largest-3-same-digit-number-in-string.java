class Solution {
    public String largestGoodInteger(String num) {
        List<Integer> set =new ArrayList<>();
        for(int i=0;i<num.length()-2;i++){
            if(num.charAt(i) == num.charAt(i+1) && num.charAt(i+1) == num.charAt(i+2) ){
                set.add(Integer.parseInt(""+num.charAt(i)+""+num.charAt(i+1)+""+num.charAt(i+2)));
            }
        }
        Collections.sort(set);
        if(set.size() == 0) return "";
        if(set.get(set.size()-1)==0) return "000";
        return String.valueOf(set.get(set.size()-1));
    }
}