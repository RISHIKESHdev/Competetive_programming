class Solution:
    def canBeIncreasing(self, nums: List[int]) -> bool:
        inc_func = lambda l: all(x < y for x, y in zip(l, l[1:]))
        return any(inc_func(nums[:i] + nums[(i + 1):]) for i in range(len(nums)))