/*
Runtime: 11 ms, faster than 24.26% of Java online submissions for Design a Stack With Increment Operation.
Memory Usage: 40.4 MB, less than 5.31% of Java online submissions for Design a Stack With Increment Operation.
*/
class CustomStack {
  
  private List<Integer> list;
  private int maxSize;
  
  public CustomStack(int maxSize) {
    list = new ArrayList<Integer>();
    this.maxSize = maxSize;
  }

  public void push(int x) {
    if(list.size() == maxSize) return;
    list.add(x);
  }

  public int pop() {
    if(list.size() == 0) return -1;
    int temp = list.get(list.size() - 1);
    list.remove(list.size() - 1);
    return temp;
  }

  public void increment(int k, int val) {
    for(var i=0;i<k && i<list.size();i++) {
      list.set(i, list.get(i) + val);
    }
  }
}