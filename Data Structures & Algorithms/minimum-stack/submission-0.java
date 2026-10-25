
class MinStack {
    
    private Stack<Integer> mainStack;
    private Stack<Integer> minimumStack;

    public MinStack() {
        mainStack = new Stack<>();
        minimumStack = new Stack<>();
    }
    
    public void push(int val) {
        mainStack.push(val);
        
        if (minimumStack.isEmpty() || val <= minimumStack.peek()) {
            minimumStack.push(val);
        }
    }
    
    public void pop() {
        if (!mainStack.isEmpty()) {
            int poppedValue = mainStack.pop();
            
            if (poppedValue == minimumStack.peek()) {
                minimumStack.pop();
            }
        }
    }
    
    public int top() {
        return mainStack.peek();
    }
    
    public int getMin() {
        return minimumStack.peek();
    }
}