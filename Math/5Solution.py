def isPowerOfTwo(n):
    k=n-1
    if(n==0 or n&k!=0):
        return False
    return True
n=int(input())
print(isPowerOfTwo(n))