def buddyStrings(s,goal):
    if len(s) != len(goal): 
        return False
    if s == goal:
        seen = set()
        for a in s:
            if a in seen:
                return True
            seen.add(a)
        return False
    pairs = []
    for a, b in zip(s, goal):
        if a != b:
            pairs.append((a, b))
        if len(pairs) >= 3: 
            return False
    return len(pairs) == 2 and pairs[0] == pairs[1][::-1]
s=input()
goal=input()
print(buddyStrings(s,goal))