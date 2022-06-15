def firstPalindrome(words):
    for i in words:
        if(i==i[::-1]):
            return(i)
    return ""
words=input().strip().split(",")
print(firstPalindrome(words))