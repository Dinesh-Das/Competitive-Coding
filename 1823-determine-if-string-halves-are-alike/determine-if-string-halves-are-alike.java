class Solution {
    public boolean halvesAreAlike(String s) {
        String a=s.substring(0,s.length()/2);
        String b=s.substring(s.length()/2,s.length());
        Set<Character> set= new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        int x=0,y=0;
        for(char ch:a.toCharArray()){
            if(set.contains(ch))x++;
        }       
        for(char ch:b.toCharArray()){
            if(set.contains(ch))y++;
        }       
        return x==y;
    }
}