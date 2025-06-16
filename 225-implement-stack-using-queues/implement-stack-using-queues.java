class MyStack {
    
    Queue<Integer> queue;
    Queue<Integer> queue1;

    public MyStack() {
        queue = new LinkedList<>();
        queue1 = new LinkedList<>();        
    }
    
    public void push(int x) {
         // Add the new element to the empty auxiliary queue (queue1)
        queue1.add(x);
        
        // Move all elements from the main queue (queue) to the auxiliary queue (queue1)
        while (!queue.isEmpty()) {
            queue1.add(queue.poll());
        }
        
        // Swap the references of queue and queue1
        Queue<Integer> temp = queue;
        queue = queue1;
        queue1 = temp;
    }
    
    public int pop() {
        return queue.poll();
    }
    
    public int top() {
        return queue.peek();
    }
    
    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */