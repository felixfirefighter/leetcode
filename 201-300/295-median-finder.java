class MedianFinder {
  /** initialize your data structure here. */
  PriorityQueue<Integer> bigQueue;
  PriorityQueue<Integer> smallQueue;
  
  public MedianFinder() {
    bigQueue = new PriorityQueue<>(Collections.reverseOrder());
    smallQueue = new PriorityQueue<>();
  }

  public void addNum(int num) {
    if(bigQueue.isEmpty()) {
      bigQueue.add(num);
      return;
    }
    
    if(bigQueue.size() == smallQueue.size()) {
      if(num < bigQueue.peek()) {
        bigQueue.add(num);
      } else {
        smallQueue.add(num);
      }
    } else if(bigQueue.size() > smallQueue.size()) {
      if(num > bigQueue.peek()) {
        smallQueue.add(num);
      } else {
        // num is smaller than the largest number in bigQueue.
        // we have to move the largest num to smallQueue 
        smallQueue.add(bigQueue.poll());
        bigQueue.add(num);
      }
    } else if(bigQueue.size() < smallQueue.size()) {
      if(num < smallQueue.peek()) {
        bigQueue.add(num);
      } else {
        bigQueue.add(smallQueue.poll());
        smallQueue.add(num);
      }
    }
  }

  public double findMedian() {
    if(smallQueue.size() == bigQueue.size()) {
      return ((smallQueue.peek() + bigQueue.peek())) * 1.0 / 2;
    } else if(smallQueue.size() > bigQueue.size()) {
      return smallQueue.peek();
    } else {
      return bigQueue.peek();
    }
  }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */