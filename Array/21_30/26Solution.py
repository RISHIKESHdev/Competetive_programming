def sumZero(n):
        out = []            
        for x in range(1, (n//2)+1):
            out.append(x)
            out.append(-x)
        if n % 2 != 0: out.append(0)
        return out
print(sumZero(int(input())))