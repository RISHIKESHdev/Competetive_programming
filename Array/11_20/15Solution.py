def findKthLargest(nums,k):
		return sorted(nums,reverse=True)[k-1]
k=int(input())
nums=[int(x.strip()) for x in input().split(",")]
print(findKthLargest(nums,k))