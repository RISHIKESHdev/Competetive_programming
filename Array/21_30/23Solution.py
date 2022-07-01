def maximumUnits(boxTypes,truckSize):
        boxTypes=sorted(boxTypes,key=lambda x:-x[1])
        ans=0
        for i in boxTypes:
            if truckSize >= i[0]:
                ans += i[0] * i[1]
                truckSize -= i[0]
                continue
            else:
                ans += truckSize * i[1]
                break
        return ans
n=int(input())
truckSize=int(input())
boxTypes=[]
for i in range(0, n):
    ele = [int(input()), int(input())]
    boxTypes.append(ele)
print(maximumUnits(boxTypes,truckSize))