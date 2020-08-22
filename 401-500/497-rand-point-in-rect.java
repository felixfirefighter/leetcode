class Solution {

  private int[][] rects;
  private Random rand;
  private TreeMap<Integer, Integer> map;
  private int area;
  
  public Solution(int[][] rects) {
    this.rects = rects;
    rand = new Random();
    map = new TreeMap<>();
    area = 0;
    for (var i=0;i<rects.length;i++) {
      // +1 to cover the edges
      area += (rects[i][2] - rects[i][0] + 1) * (rects[i][3] - rects[i][1] + 1);
      map.put(area, i);
    }
  }

  public int[] pick() {
    var randomNum = map.ceilingKey(rand.nextInt(area + 1));
    
    var selectedRect = rects[map.get(randomNum)];
    var left = selectedRect[0]; // x1
    var bottom = selectedRect[1]; // y1
    var right = selectedRect[2]; // x2
    var top = selectedRect[3]; // y2
    
    int x = left + rand.nextInt(right - left + 1);
    int y = bottom + rand.nextInt(top - bottom + 1);
    return new int[] { x, y };
  }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(rects);
 * int[] param_1 = obj.pick();
 */