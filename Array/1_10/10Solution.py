nums=[ int(x.strip()) for x in input().split(",")]
carry=1
i=len(nums)-1
while True:
    carry=nums[i]+carry
    if(carry>9):
        nums[i]=carry%10
        carry=int(carry/10)
        i-=1
        if(i<0 and carry>0):
            nums.insert(0,carry)
            print(nums)
            break
    else:
        nums[i]=carry
        break
print(nums)