/*
Runtime: 5 ms, faster than 69.05% of Java online submissions for Asteroid Collision.
Memory Usage: 39.5 MB, less than 9.99% of Java online submissions for Asteroid Collision.
*/
class Solution {
  public int[] asteroidCollision(int[] asteroids) {
    var st = new Stack<Integer>();
    
    for(var asteroid : asteroids) {
      if(st.isEmpty()) {
        st.push(asteroid);        
      } else {
        var asteroidSurvived = true;
        while(!st.isEmpty() && st.peek() > 0 && asteroid < 0) {
          if(st.peek() < Math.abs(asteroid)) {
            st.pop();
          } else {
            if(st.peek() == Math.abs(asteroid)) {
              st.pop();
            }
            
            asteroidSurvived = false;
            break;
          }
        }
        if(asteroidSurvived) {
          st.push(asteroid);
        }
      }
    }
    
    var res = new int[st.size()];
    for(var i=res.length-1;i>=0;i--) {
      res[i] = st.pop();
    }
    
    return res;
  }
}