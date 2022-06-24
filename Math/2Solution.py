def countBits(n):
        bitArray = [-1]*(n+1)
        for i in range(n+1):
            binary = bin(i).replace("0b","")
            bitArray[i] = binary.count("1")
        return bitArray
n=int(input())
print(countBits(n))