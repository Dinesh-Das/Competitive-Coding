class MinStack {
    List<Long> lst;
    int size;
    long minVal;
    public MinStack() {
        size=0;
        lst=new ArrayList<>();
        minVal=Integer.MAX_VALUE +1L;
    }
    
    public void push(int val) {
        long cur=val;
        if(val < minVal){
            cur=2*(long)val-minVal;
            minVal=val;
        }
        lst.add(cur);
        size++;
    }
    
    public void pop() {
        long cur=lst.get(size-1);
        if(cur < minVal){
            minVal=2*(long)minVal-cur;
        }
        lst.remove(size-1);
        size--;
    }
    
    public int top() {
        long cur=lst.get(size-1);
        if(cur < minVal){
            cur=minVal;
        }
       return (int)cur;
    }
    
    public int getMin() {
        return (int)minVal;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */