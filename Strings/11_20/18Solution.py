def groupAnagrams(strs):
        res=defaultdict(list)
        for s in strs:
            count = [0]*26
            for c in s:
                count[ord(c)-ord("a")]=+1
            res[tuple(count)].append(s)
        return res.values()
groupAnagrams([input() for _ in range(int(input()))])
#hi