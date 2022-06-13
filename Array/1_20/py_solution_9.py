def countOdds(low,high):
        i=0
        a=high-low+1
        if a%2==0:
            i=a//2
        else:
            if high%2==0 and low%2==0:
                i=(a-1)//2
            else:
                i=(a+1)//2
        return(i)
print(countOdds(int(input()),int(input())))