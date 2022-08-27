def findTwoSum(nums, target):
  d = {}
  n = len(nums)
  for i in range(n):
    m = target - nums[i]
    if m in d:
      return [d[m],i]
    d[nums[i]] = i
arr = [ int(x.strip()) for x in input().split(",")]
target=int(input())
print(findTwoSum(arr, target))

# def findTwoSum(nums, target):
#   try:
#     numsMap = [None]*target
#     for p in range(0,len(nums)):
#       currentMapVal = numsMap[nums[p]];
#       if(currentMapVal or currentMapVal==0) :
#         return (currentMapVal, p);
#       else :
#         numberToFind = target - nums[p];
#         numsMap[numberToFind] = p;
#     return
#   except:
#    return "Invalid input array"
# arr = [ int(x.strip()) for x in input().split(",")]
# target=int(input())
# print([findTwoSum(arr, target) if target>0 else "Invalid target"]);