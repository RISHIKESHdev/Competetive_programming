def solution(target,arr):
    return(sorted(target)==sorted(arr))
target = [ int(x.strip()) for x in input().split(",")]
arr = [ int(x.strip()) for x in input().split(",")]
print(solution(target,arr))