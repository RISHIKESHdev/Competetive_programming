def first_missing_positive_integer(arr):
    try:
        length = len(arr)
        if length>1:
            for i in range(length):
                correctPos = arr[i] - 1
                while 1 <= arr[i] <= max(arr) and arr[i] != arr[correctPos]:
                    arr[i], arr[correctPos] = arr[correctPos], arr[i]
                    correctPos = arr[i] - 1
            print(arr,end="\nResult ")
            for i in range(length):
                if i + 1 != arr[i]:
                    return i + 1
            return length + 1
        else:
            print(arr,end="\nResult ")
            return arr[0]+1
    except:
        return("Invalid input")

arr = [ int(x.strip()) for x in input().split(",")]
print(first_missing_positive_integer(arr))