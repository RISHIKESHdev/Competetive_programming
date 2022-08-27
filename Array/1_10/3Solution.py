def minCostClimbingStairs(arr):
    n=len(arr)
    db=[None]*n
    return (min(costStair(n-1,arr,db),costStair(n-2,arr,db)))
def costStair(n,arr,db):
    if(n<0):
        return 0
    if(n==0 or n==1):
        return arr[n]
    if(db[n]):
             return(db[n])

    ab=arr[n]+min(costStair(n-1,arr,db),costStair(n-2,arr,db))
    return (ab)
arr = [ int(x.strip()) for x in input().split(",")]
print(minCostClimbingStairs(arr))