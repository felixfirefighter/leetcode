class Solution:
    def minTimeToVisitAllPoints(self, points: List[List[int]]) -> int:
        # the time required from point A[Ax, Ay] to point B[Bx, By] 
        # is the difference between |Bx - Ax| or |By - Ay|, whichever one
        # is greater
        time = 0
        for i in range(1, len(points)):
          cur = points[i]
          prev = points[i-1]
          time += max(abs(cur[0] - prev[0]), abs(cur[1] - prev[1]))
        return time
          