def wordPattern(pattern,s):
        mapping_p_s = {}
        mapping_s_p = {}
        s=s.split()
        if(len(s)!=len(pattern)):
            return False
        for c1,c2 in zip(pattern,s):
            if (c1 not in mapping_p_s and c2 not in mapping_s_p):
                mapping_p_s[c1] = c2
                mapping_s_p[c2] = c1
                print(mapping_p_s)
                print(mapping_s_p)
            elif (mapping_p_s.get(c1) != c2 or mapping_s_p.get(c2) != c1):
                return False
        return True
pattern=input()
s=input()
print(wordPattern(pattern,s))
