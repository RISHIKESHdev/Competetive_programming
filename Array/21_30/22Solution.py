def generate(numRows):
        m=[]
        l=[[1],[1,1]]
        if numRows==1:
            return([[1]])
        elif numRows==2:
            return([[1],[1,1]])
        else:
            for i in range(2,numRows):
                m=[1]
                for j in range(1,i):
                    m.append(l[i-1][j-1]+l[i-1][j])
                m.append(1)
                l.append(m)
            return(l)
numRows=int(input())
print(generate(numRows))
