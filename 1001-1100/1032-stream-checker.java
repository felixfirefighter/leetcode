class StreamChecker {

  class TrieNode {
    boolean isWord;
    TrieNode[] next = new TrieNode[26];
  }

  TrieNode root = new TrieNode();
  StringBuilder sb = new StringBuilder();

  public StreamChecker(String[] words) {
    for(var word : words) {
      TrieNode node = root;
      
      for(var i=word.length() - 1;i>=0;i--) {
        char c = word.charAt(i);
        if(node.next[c - 'a'] == null) {
          node.next[c - 'a'] = new TrieNode();
        }
        node = node.next[c - 'a'];
      }
      node.isWord = true;
    }
  }

  public boolean query(char letter) {
    sb.append(letter);
    TrieNode node = root;
    
    for(var i=sb.length() - 1;i>=0 && node != null;i--) {
      char c = sb.charAt(i);
      node = node.next[c - 'a'];
      if(node != null && node.isWord) {
        return true;
      }
    }
    return false;
  }
}

/**
 * Your StreamChecker object will be instantiated and called as such:
 * StreamChecker obj = new StreamChecker(words);
 * boolean param_1 = obj.query(letter);
 */