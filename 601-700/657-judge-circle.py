class Solution:
    def judgeCircle(self, moves: str) -> bool:
        # +1 to y for up(U) and vice versa
        y = 0
        # +1 to x for moving right and vice versa
        x = 0
        
        for move in moves:
            if move == "U":
                y += 1
            elif move == "D":
                y -= 1
            elif move == "R":
                x += 1
            elif move == "L":
                x -= 1
                
        return y == 0 and x == 0