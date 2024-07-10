class MinStack {
    List<Integer> l=new ArrayList<>();
    List<Integer> l1=new ArrayList<>();
    public MinStack() {

        
    }
    
    public void push(int val) {
        l.add(val);
        if(l1.size()==0)
        {
            l1.add(val);
        }
        else
        {
            l1.add(Math.min(val,l1.get(l1.size()-1)));
        }
        
        
    }
    
    public void pop() {
        if(l1.size()!=0)
         {
            l1.remove(l1.size()-1);
            l.remove(l.size()-1);

         }
        
    }
    
    public int top() {
        return l.get(l.size()-1);
        
    }
    
    public int getMin() {
        return l1.get(l1.size()-1);
        
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