class Solution {
    public boolean backspaceCompare(String s, String t) {
        return makeString(s).equals(makeString(t));
    }
    public static String makeString(String s)
    {
        Stack<Character> res= new Stack();
        for(char c:s.toCharArray())
        {
            if(c != '#')
            {
                res.push(c);
            }else if(!res.isEmpty())
            {
                res.pop();
            }
        }
        return String.valueOf(res);
    }
}