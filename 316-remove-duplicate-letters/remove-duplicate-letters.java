class Solution {
    public String removeDuplicateLetters(String s) {
        int[] chars = new int[26];
        boolean[] visited= new boolean[26];
        Stack<Integer> stack= new Stack<>();
        for(int i=0;i<s.length();i++){
            chars[s.charAt(i)-'a']=i;
        }

        for(int i=0;i<s.length();i++){
            int cur=s.charAt(i)-'a';
            if(visited[cur]) continue;
            while(!stack.isEmpty() && stack.peek() > cur && i < chars[stack.peek()]){
                visited[stack.pop()]=false;
            }
            stack.push(cur);
            visited[cur]=true;
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()) sb.append((char)(stack.pop()+'a'));
        return sb.reverse().toString();
    }
}