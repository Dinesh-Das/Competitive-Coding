class Solution {
    public int longestValidParentheses(String s) {
        int maxLength=0;
        Stack<Integer> stk=new Stack<>();
        stk.push(-1);
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='{'||ch=='['||ch=='('){
                stk.push(i);
            }else{
                stk.pop();
                if(stk.isEmpty()){
                    stk.push(i);
                }else{
                    maxLength=Math.max(maxLength,i-stk.peek());
                }
            }
        }
        return maxLength;
    }
}