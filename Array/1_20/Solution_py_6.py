def backspaceStr(s):
    s_1=""
    t_1=""
    map(lambda n: [s_1.append(n) if(n!="#") else s_1.rstrip(s_1[-1])], s)
    map(lambda n: [t_1.append(n) if(n!="#") else t_1.rstrip(t_1[-1])], t)
    return(True if(s_1==t_1) else False)

s = input()
t = input()
print(backspaceStr(s))