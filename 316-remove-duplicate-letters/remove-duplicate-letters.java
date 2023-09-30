class Solution {
    public String removeDuplicateLetters(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        Stack<Character> stack= new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            while(!stack.isEmpty() && stack.peek() > ch && map.get(stack.peek()) > 1 && !stack.contains(ch) ){
                map.put(stack.peek(),map.get(stack.peek())-1);
                stack.pop();
            }
            if(!stack.contains(ch)){
                stack.push(ch);
            }else{
                map.put(ch,map.get(ch)-1);
            }
        }
        StringBuilder sb = new StringBuilder();
        // for(char ch: stack) sb.append(ch);
        for(int i=0;i<stack.size();i++){
            char ch=stack.get(i);
            sb.append(ch);
        }
        return sb.toString();
    }
}