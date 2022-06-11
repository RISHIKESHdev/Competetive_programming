arr = [ int(x.strip()) for x in input().split(",")]
i=0
area=0
while True:
    if i+1<len(arr) and not(arr[i]==0 and i==0 ):
        for j in arr[i+1:]:
            if(j>=arr[i] and arr[i+1:].index(j)!=0):
                area+=(arr[i]*(arr[i+1:].index(j)))
                area-=sum([k for k in arr[i+1:arr[i+1:].index(j)+i+1]])
                i=arr[i+1:].index(j)+i+1
                break
            elif(j<=arr[i]):
                if (arr[i]>max(arr[i+1:])):
                    i+=1
                pass
            else:
                pass
    elif(i<len(arr)):
        i+=1
        pass
    else:
        break
print(area) 