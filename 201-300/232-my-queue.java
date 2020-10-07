class MyQueue {

  Stack<Integer> data;
  Stack<Integer> temp;
  
  /** Initialize your data structure here. */
  public MyQueue() {
    data = new Stack<>();
    temp = new Stack<>();
  }

  /** Push element x to the back of queue. */
  public void push(int x) {
    temp = new Stack<>();
    
    while(!data.empty()) {
      temp.push(data.pop());
    }
    
    temp.push(x);
    
    while(!temp.empty()) {
      data.push(temp.pop());
    }
  }

  /** Removes the element from in front of queue and returns that element. */
  public int pop() {
    return data.pop();
  }

  /** Get the front element. */
  public int peek() {
    return data.peek();
  }

  /** Returns whether the queue is empty. */
  public boolean empty() {
    return data.empty();
  }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */