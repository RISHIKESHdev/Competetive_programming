def minSubsequence(nums):
        s = sum(nums)
        nums.sort(reverse = True)
        
        cs, i = 0, 0
        res = []
        for i, c in enumerate(nums):
            if cs > s / 2:
                return res
            cs += nums[i]
            res.append(nums[i])
            i += 1
            
        return res
nums=[ int(x.strip()) for x in input().split(",")]
print(minSubsequence(nums))