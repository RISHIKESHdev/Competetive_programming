arr = [ int(x.strip()) for x in input().split(",")]
arrs, curr_sum = set(), 0
ans = 0
st = 0
for num in arr:
    if num not in arrs:
        arrs.add(num)
        curr_sum += num
    else:
        while num in arrs:
            arrs.discard(arr[st])
            curr_sum -= arr[st]
            st += 1
        arrs.add(num)
        curr_sum += num
    ans = max(ans,curr_sum)
print(ans)