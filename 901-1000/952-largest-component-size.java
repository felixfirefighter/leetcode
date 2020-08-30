class Solution {
  public int largestComponentSize(int[] A) {
    int n = A.length;
    
    // key = factor, val = node index
    var map = new HashMap<Integer, Integer>();
    UnionFind uf = new UnionFind(n);
    
    for(var i=0;i<n;i++) {
      var el = A[i];
      for(var j=2;j*j <= el;j++) {
        if(el % j == 0) {
          
          // no index has claimed the factor
          if(!map.containsKey(j)) {
            map.put(j, i);
          } else {
            uf.union(i, map.get(j));
          }
          
          if(!map.containsKey(el/j)) {
            map.put(el/j, i);
          } else {
            uf.union(i, map.get(el/j));
          }
        }
      }
      
      if(!map.containsKey(el)) {
        map.put(el, i);
      } else {
        uf.union(i, map.get(el));
      }
    }
    
    return uf.max;
  }
  
  class UnionFind {
    int[] parent;
    int[] size;
    int max;
    
    public UnionFind(int n) {
      parent = new int[n];
      size = new int[n];
      max = 1;
      
      for(var i=0;i<n;i++) {
        parent[i] = i;
        size[i] = 1;
      }
    }
    
    public void union(int x,int y) {
      int rootX = find(x);
      int rootY = find(y);
      if(rootX != rootY) {
        parent[rootX] = rootY;
        size[rootY] += size[rootX];
        max = Math.max(max, size[rootY]);
      }
    }
    
    public int find(int x) {
      if(x == parent[x]) {
        return x;
      }
      return parent[x] = find(parent[x]);
    }
  }
}

