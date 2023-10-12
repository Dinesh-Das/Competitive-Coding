class Solution {
    public int partitionString(String s) {
        int cnt=0;
        Set<Character> set = new HashSet<>();
        Set<String> data=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                System.out.println(set);
                cnt++;
                set.clear(); 
                set.add(s.charAt(i));
            }else{
                set.add(s.charAt(i));
            }
        }
        if(set.size() > 0) cnt++;
        return cnt;
    }
}