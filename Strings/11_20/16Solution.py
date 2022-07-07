def romanToInt(s):
    dic = { "I": 1, "V": 5, "X": 10, "L": 50,"C": 100, "D": 500, "M": 1000}
    rules = { "I": "Z", "V": "I", "X": "I", "L": "X","C": "X", "D": "C", "M": "C"}
    total = 0
    prev = 0
    for letter in s:
        total = total + dic[letter] - 2*dic[prev] if rules[letter] == prev else total + dic[letter]
        prev = letter
    return total
print(romanToInt(input()))