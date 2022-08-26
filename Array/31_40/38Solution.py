def isValidSudoku(board):
        row=len(board[0])
        column=len(board)
        h={}
        for i in range(row):
            h={}
            for j in range(column):
                h[board[i][j]] = 1+h.get(board[i][j],0)
                if (board[i][j] !="." and h[board[i][j]]>1):
                    return False
        h={}
        for j in range(row):
            h={}
            for i in range(column):
                h[board[i][j]] = 1+h.get(board[i][j],0)
                if (board[i][j] !="." and h[board[i][j]]>1):
                    return False
        h={(0,0):[],(0,1):[],(0,2):[],(1,0):[],(1,1):[],(1,2):[],(2,0):[],(2,1):[],(2,2):[]}
        for i in range(row):
            for j in range(column):
                if (board[i][j] !="." and (board[i][j] in h.get((i//3,j//3),[]))):
                    return False 
                h[(i//3,j//3)].append(board[i][j])
        return True
board=[[],[],[],[],[],[],[],[],[]]
for i in range(9):
    for j in range(9):
        board[i][j]=int(input())
print(isValidSudoku(board))
