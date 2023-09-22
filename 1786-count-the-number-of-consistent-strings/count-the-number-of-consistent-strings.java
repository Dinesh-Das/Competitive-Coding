class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set= new HashSet<>();
        for(char ch:allowed.toCharArray()) set.add(ch);
        int cnt=0;
        boolean flag=true;
        for(String str:words){
            flag=true;
            for(char ch:str.toCharArray()){
                if(!set.contains(ch)){
                    flag=false;
                    break;
                }
            }
            if(flag){
                cnt++;
            }
        }
        return cnt;
      }
}