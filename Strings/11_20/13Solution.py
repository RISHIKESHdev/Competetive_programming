def checkInclusion(s1,s2):
        ascii_s1=0
        ascii_s2=0
        if(len(s1)>len(s2)):
            return False
        for i in s1:
            ascii_s1+=ord(i)
        print(ascii_s1)
        for i in range(len(s1)):
            ascii_s2+=ord(s2[i])
        if(ascii_s2==ascii_s1):
            return True
        for i in range(1,len(s2)-len(s1)+1):
            ascii_s2=ascii_s2-ord(s2[i-1])+ord(s2[len(s1)-1+i])
            if(ascii_s2==ascii_s1 and ''.join(sorted(s2[i:len(s1)+i]))==''.join(sorted(s1))):
                return True
        return False
print(checkInclusion(int(input()),int(input())))