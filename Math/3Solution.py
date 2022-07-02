def isHappy(n):
    seen = set()
    while n != 1:
        s = 0
        for i in str(n):
            s += pow(int(i), 2)
        n=s
        if n in seen:
            return False
        seen.add(n)
    return n == 1
print(isHappy(int(input())))