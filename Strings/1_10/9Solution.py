def lengthOfLongestSubstring(s):
        dic = {}
        ans = 0
        tmp = 0
        start = 0
        for i in range(len(s)):
            if dic.get(s[i], -1)==-1:
                dic[s[i]] = i
                tmp+=1
                ans = max(ans,tmp)
            else:
                if dic[s[i]] >= start:
                    tmp = tmp - (dic[s[i]] - start)
                    start = dic[s[i]]+1
                    dic[s[i]] = i
                else:
                    dic[s[i]] = i
                    tmp +=1
                    ans = max(ans, tmp)
        return ans
s=input()
print(lengthOfLongestSubstring(s))