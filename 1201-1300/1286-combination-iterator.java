// https://leetcode.com/problems/iterator-for-combination/discuss/451291/Java-Using-Queue-hasNext-0(1)-next-0(1)
class CombinationIterator {
  private Queue<String> q = new LinkedList<String>();
  private String ori = "";

  public CombinationIterator(String characters, int combinationLength) {
    ori = characters;
    gen("", 0, combinationLength);
  }

  private void gen(String str, int index, int len) {
    if(len == 0) {
      q.add(str);
      return;
    }

    for(int i=index;i<ori.length();i++) {
      char c = ori.charAt(i);
      gen(str + c, i + 1, len - 1);
    }
  }
  
  public String next() {
    if(!q.isEmpty()) return q.poll();
    return "";
  }
  
  public boolean hasNext() {
    return !q.isEmpty();
  }
}

/**
* Your CombinationIterator object will be instantiated and called as such:
* CombinationIterator obj = new CombinationIterator(characters, combinationLength);
* String param_1 = obj.next();
* boolean param_2 = obj.hasNext();
*/