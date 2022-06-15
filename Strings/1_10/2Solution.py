def removeOuterParentheses(s):
        n = 0
        s_1 = ''
        for i in s:
            if i == '(':
                n+= 1
            if n > 1:
                s_1 += i
            if i == ')':
                n-= 1
        return s_1
s=input()
print(removeOuterParentheses(s))