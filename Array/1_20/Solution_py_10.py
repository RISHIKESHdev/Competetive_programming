nums=[ int(x.strip()) for x in input().split(",")]
curr = 0
for i in range(len(nums)):
    if nums[i]!=0:
        nums[curr] = nums[i]
        if i > curr:
             nums[i] = 0
        curr+=1
                