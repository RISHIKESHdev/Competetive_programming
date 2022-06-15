def backspaceStr(s,t):
    s_1=""
    t_1=""
    if(s==t):
        return True
    for i in s:
        if (i=="#"):
            if (s_1!=""):
                s_1=s_1[:len(s_1)-1]
        else:
            s_1=s_1+i
    for j in t:
        if (j=="#"):
            if (t_1!=""):
                t_1=t_1[:len(t_1)-1]
        else:
            t_1=t_1+j
    print(s_1,t_1)
    return(s_1==t_1)

s = input()
t = input()
print(backspaceStr(s,t))