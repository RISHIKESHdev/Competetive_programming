s=input()
a, h = ord('a'), [0] * 26
for c in s:
    h[ord(c) - a] += 1
    m = max(h)
    l = [None] * m
for j in range(26):
    c, x = chr(j + a), h[j]
    for i in range(x):
        l[i] = l[i] or []
        l[i].append(c)
r=''
for i in range(m):
    ss = l[i]
    if i & 1:
        ss = ss[::-1]   
    r += ''.join(ss)
print(r) 