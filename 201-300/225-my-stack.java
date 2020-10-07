class MyStack {
  Queue<Integer> dataQueue;
  Queue<Integer> tempQueue;
  
  /** Initialize your data structure here. */
  public MyStack() {
    dataQueue = new LinkedList<>();
  }

  /** Push element x onto stack. */
  public void push(int x) {
    tempQueue = new LinkedList<>();
    tempQueue.add(x);
    
    while(!dataQueue.isEmpty()) {
      tempQueue.add(dataQueue.poll());
    }
    
    while(!tempQueue.isEmpty()) {
      dataQueue.add(tempQueue.poll());
    }
  }

  /** Removes the element on top of the stack and returns that element. */
  public int pop() {
    return dataQueue.poll();
  }

  /** Get the top element. */
  public int top() {
    return dataQueue.peek();
  }

  /** Returns whether the stack is empty. */
  public boolean empty() {
    return dataQueue.isEmpty();
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