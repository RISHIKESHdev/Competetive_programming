from collections import deque 

def orangesRotting(grid):
        rows, cols = len(grid), len(grid[0])
        q = deque([])
        targets = 0
        for r in range(rows):
            for c in range(cols):
                if grid[r][c] == 2:
                    q.append((r, c, 0))
                elif grid[r][c] == 1:
                    targets += 1
        if targets == 0:
            return 0
        
        while q:
            r, c, step = q.popleft()
            for x, y in (r+1, c), (r-1, c), (r, c+1), (r, c-1):
                if (not 0 <= x < rows) or (not 0 <= y < cols):
                    continue
                if grid[x][y] != 1:
                    continue
                grid[x][y] = 2
                q.append((x, y, step+1))
                targets -= 1
                if targets == 0:
                    return step+1
        
        return -1