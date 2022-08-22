def shortestPathBinaryMatrix(grid):
        if grid[0][0]==1:
            return -1
        directions = [[1,0],[-1,0],[0,1],[0,-1],
                      [1,1],[1,-1],[-1,1],[-1,-1]]
        
        queue = [(1,0,0)]
        visited = set()
        while queue:
            length, row, column = queue.pop(0)
            if row==len(grid)-1 and column==len(grid)-1:
                return length
            for direct in directions:
                new_row = direct[0] + row
                new_col = direct[1] + column
                if new_row>=0 and new_col>=0 and new_row<len(grid) and new_col<len(grid) and grid[new_row][new_col]==0 and (new_row, new_col) not in visited:
                    queue.append((length+1, new_row, new_col))
                    visited.add((new_row, new_col))
        return -1
print(shortestPathBinaryMatrix([[0,0,0,0,0],[0,0,0,0,0],[0,0,0,0,0],[0,0,0,0,0],[0,0,0,0,0]]))