num=0
mnum=[]
string=input()
for st in string:
    if(st=="("):
        num+=1
    elif(st==")"):
        mnum.append(num)
        num-=1
    else:
        pass
print(max(mnum))