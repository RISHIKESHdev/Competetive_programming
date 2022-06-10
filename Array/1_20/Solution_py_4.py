

def getMaxWaterContainer(arr) :
  p1 = 0
  p2 = len(arr) - 1
  maxArea = 0
  while(p1 < p2) :
    height = min(arr[p1], arr[p2])
    width = p2 - p1
    area = height * width
    maxArea = max(maxArea, area)
    
    if(arr[p1] <= arr[p2]):
      p1+=1
    else :
      p2-=1
  return maxArea;

arr = [ int(x.strip()) for x in input().split(",")]
print(getMaxWaterContainer(arr))