def targetIndices(nums,target):
        equal=great=less=0
        lst=[]
        for i in range(len(nums)):
            if nums[i]<target:
                less=less+1
            elif nums[i]==target:
                equal=equal+1
            else:
                great=great+1
        for j in range(equal):
            lst.append(less+j)
        return lst
nums=[ int(x.strip()) for x in input().split(",")]
target=int(input())