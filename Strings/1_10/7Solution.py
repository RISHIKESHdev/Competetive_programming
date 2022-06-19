from collections import Counter
def greatestLetter(s):
        count=Counter(s)
            
        for ascii_value in reversed(range(65, 65+26)):
            u=chr(ascii_value)
            l=u.lower()
            if count[u] and count[l]:
                return u
        
        return ''

s=input()
print(greatestLetter(s))