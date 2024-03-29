def firstMissingPositive(nums):
        nums.append(0)
        n = len(nums)
        for i in range(n):
            if not (1 <= nums[i] < n):
                nums[i] = 0
        for i in range(n):
            nums[nums[i] % n] += n
        for i in range(1, n):
            if nums[i] // n == 0:
                return i
        return n
nums = [ int(x.strip()) for x in input().split(",")]
print(firstMissingPositive(nums))
