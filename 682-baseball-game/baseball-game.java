class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack= new Stack<>();
        for(String val:operations){
            if(val.equals("D")){
                int prev=stack.peek();
                stack.push(prev*2);
            }else if (val.equals("C")){
                stack.pop();
            }else if(val.equals("+")){
                int a=stack.size()>=2?stack.get(stack.size()-2):0;
                int b=stack.get(stack.size()-1);
                stack.push(a+b);
            }else{
                stack.push(Integer.parseInt(val));
            }
        }
        int sum=0;
        for(int val:stack) sum+=val;
        return sum;
    }
}