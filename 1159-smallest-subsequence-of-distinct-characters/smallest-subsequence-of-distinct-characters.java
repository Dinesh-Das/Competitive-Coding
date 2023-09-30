class Solution {
    public String smallestSubsequence(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
        while(!stack.isEmpty() && stack.peek() > ch && map.get(stack.peek()) > 1 && !stack.contains(ch)){
                map.put(stack.peek(),map.get(stack.peek())-1);
                stack.pop();   
            }
            if(!stack.contains(ch)) {
                stack.push(ch);
            }else{
                 map.put(ch,map.get(ch)-1);
            }
        }    
        StringBuilder sb=new StringBuilder();
        for(char ch:stack) sb.append(ch);
        return sb.toString();
    }
}