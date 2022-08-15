matrix=[[3,4,5],[3,2,6],[2,2,1]]
ROWS=len(matrix)
COLUMNS=len(matrix[0])
dp={}
        
def dfs(r,c,prevVal):
            if(r<0 or c<0 or r>=ROWS or c>=COLUMNS or matrix[r][c]<=prevVal):
                return 0
            if (r,c) in dp:
                return dp[(r,c)]
            res=1
            res=max(res,1 + dfs(r+1,c,matrix[r][c]))
            res=max(res,1 + dfs(r-1,c,matrix[r][c]))
            res=max(res,1 + dfs(r,c+1,matrix[r][c]))
            res=max(res,1 + dfs(r,c-1,matrix[r][c]))
            dp[(r,c)]=res
            return res
            
for r in range(ROWS):
    for c in range(COLUMNS):
                dfs(r,c,-1)
print(max(dp.values()))