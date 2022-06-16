nums=[ int(x.strip()) for x in input().split(",")]
carry=1
i=len(nums)-1
while True:
    carry=nums[i]+carry
    if(nums[i]>9):
        nums[i]=carry%10
        carry=carry/10
        i-=1
    else:
        nums[i]=carry
        break
print(nums)