import regex as re
def countValidWords(sentence):
    return len(list(filter(lambda x: re.match('^[a-z]*([a-z]-[a-z])?[a-z]*[!\.,]?$', x), sentence.split())))
print(countValidWords(input()))