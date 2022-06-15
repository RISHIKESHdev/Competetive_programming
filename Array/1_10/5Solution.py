def countKDifference(arr,k):
        res = 0
        for i in range(len(arr)):
            ft = filter(lambda j: j==k, map(lambda n: abs(n-arr[i]), arr[i:]))
            res += len([x for x in ft])
        else:
            return res

arr = [ int(x.strip()) for x in input().split(",")]
k=int(input())
print(countKDifference(arr,k))