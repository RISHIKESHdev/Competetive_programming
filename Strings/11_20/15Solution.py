def func(tempLow,tempHigh,s):
    res = ''
    while(tempLow>=0 and tempHigh<len(s) and s[tempLow] == s[tempHigh]):
        if(tempLow!=tempHigh):
            res = s[tempLow]+res+s[tempHigh]
        else:
            res = s[tempLow]
        tempLow-=1
        tempHigh+=1
    return res
def maxFunc(s1,s2):
    if(len(s1)>len(s2)):
        return s1
    else:
        return s2
def longestPalindrome(s):
    lenStr = len(s)
    arr = ''
    for i in range(lenStr):
        temp = func(i,i,s)
        arr = maxFunc(temp,arr)
        temp = func(i,i+1,s)
        arr = maxFunc(temp,arr)
    return arr
print(longestPalindrome(input()))