arr = [ int(x.strip()) for x in input().split(",")]
i=0
area=0
while i<len(arr)-1:
    i+=1 if(arr[i]==0 and i==0 ) else i
    for j in range(i+1,len(arr[i+1:])+i+1):
        if(j>i ):
            if(arr[j]>=arr[i]):
                area+=arr[i]*(j-i-1)
                area-=sum([n for n in arr[i+1:j]])
                i=j
            elif(i<len(arr) and arr[i]>max(arr[i+1:])):
                j=arr[i+1:].index(max(arr[i+1:]))
                area+=arr[i+1+j]*(j)
                area-=sum([m for m in arr[i+1:j+i+1]])
                i+=j+1
            if(i>=len(arr)-1):
                break
print(area)