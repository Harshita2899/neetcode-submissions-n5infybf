class MinStack {
    long min;
    List<Long> st;
    public MinStack() {
        
        st = new ArrayList();
    }
    
    public void push(int val) {
        if(st.size()==0)
        {
            st.add((long)val);
            min = val;
            return;
        }
        long top=val;
        if (min>=val)
        {
            top = 2*val-min;
            min = val;
        }
        st.add(top);
        
    }
    
    public void pop() {
        if(top()<=min)
        {
            min = 2*min - st.get(st.size()-1);
        }
        st.remove(st.size()-1);
    }
    
    public int top() {
        return Math.toIntExact(st.get(st.size()-1));
    }
    
    public int getMin() {
        return (int)min;
    }
}
