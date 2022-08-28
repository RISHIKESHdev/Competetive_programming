import numpy as np

print("rows: ",end="")
row=int(input())
print("column: ",end="")
column=int(input())
print("Please select start point: ")
si=int(input())
sj=int(input())
print("Please selec destination point")
di=int(input())
dj=int(input())
distList={}
score=0
result=[]
auxRow=[]
auxMatrix=[]
dist=0
#randomly generate 2D matrix
matrix=np.random.choice([0,1,2],(row,column),p=[0.40,0.40,0.20])
#makeing a copy of the input matrix
for i in range(row):
    for j in range(column):
        auxRow.append(matrix[i][j])
    auxMatrix.append(auxRow)
    auxRow=[]
matrix[si][sj]=1
matrix[di][dj]=-1
auxMatrix[si][sj]=1
auxMatrix[di][dj]=-1
print("\nPond\n")
for i in range(row):
    for j in range(column):
        print(matrix[i][j],end="\t")
    print("\n")


def findPath(auxMatrix,matrix,si,sj,row,column,dist,score):
    if(si<0 or si>=row or sj<0 or sj>=column):
        return
    if(matrix[si][sj]==0):
        return
    if(matrix[si][sj]==-1):
        if dist in distList.keys():
            if score>distList[dist]:
                distList[dist]=score
        else:
            distList[dist]=score
        # distList.append([dist,score])
        return
    if(matrix[si][sj]==2):
        score=score+1
    matrix[si][sj]=0
    dist=dist+1
    findPath(auxMatrix,matrix,si-1,sj,row,column,dist,score)
    findPath(auxMatrix,matrix,si+1,sj,row,column,dist,score)
    findPath(auxMatrix,matrix,si,sj-1,row,column,dist,score)
    findPath(auxMatrix,matrix,si,sj+1,row,column,dist,score)
    findPath(auxMatrix,matrix,si-1,sj+1,row,column,dist,score)
    findPath(auxMatrix,matrix,si+1,sj+1,row,column,dist,score)
    findPath(auxMatrix,matrix,si-1,sj-1,row,column,dist,score)
    findPath(auxMatrix,matrix,si+1,sj-1,row,column,dist,score)
    if(auxMatrix[si][sj]==2):
        score=score-1
        matrix[si][sj]=2
    elif(auxMatrix[si][sj]==1):
        matrix[si][sj]=1
    elif(auxMatrix[si][sj]==-1):
        pass
    dist=dist-1

findPath(auxMatrix,matrix,si,sj,row,column,dist,score)

distListKeys=sorted(distList.keys())
print("Top 5 paths \n")
print("Position\tDistance\tScore")
k=1
for i in distListKeys:
    if(k==6):
        break
    print(k,"\t\t",i,"\t\t",distList.get(i,0))
    k=k+1