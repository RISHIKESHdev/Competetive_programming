def calPoints(ops):
        i = j = 0
        while j < len(ops):
            if ops[j] == "C":
                i -= 2
            elif ops[j] == "D":
                ops[i] = int(ops[i-1])*2
            elif ops[j] == "+":
                ops[i] = int(ops[i-1]) + int(ops[i-2])
            else:
                ops[i] = int(ops[j])
            i += 1
            j += 1
        return sum(ops[:i])
ops=[ x.strip() for x in input().split(",")]
print(calPoints(ops))