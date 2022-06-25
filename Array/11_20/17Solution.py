def maxSubArray(nums):
    dp = []
    dp.append(nums[0])
    currLarge = dp[0]
    for i in range(1, len(nums)):
        dp.append(max(dp[i-1] + nums[i], nums[i]))
        if dp[i] > currLarge:
            currLarge = dp[i]
    return currLarge
nums=[ int(x.strip()) for x in input().split(",")]
print(maxSubArray(nums))