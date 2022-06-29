def findMedianSortedArrays(nums1,nums2):
        nums=sorted(nums1+nums2)
        return float(nums[len(nums)//2]) if len(nums)%2 != 0 else (nums[len(nums)//2-1]+nums[len(nums)//2])/2
nums1 = [ int(x.strip()) for x in input().split(",")]
nums2 = [ int(x.strip()) for x in input().split(",")]
print(findMedianSortedArrays(nums1,nums2))