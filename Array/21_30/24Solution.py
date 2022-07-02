def maxArea(h,w,horizontalCuts,verticalCuts):
        horizontalCuts=sorted(horizontalCuts)
        verticalCuts=sorted(verticalCuts)
        maxh=0
        maxv=0
        if (len(horizontalCuts)==1):
            maxh=max(horizontalCuts[0],h-horizontalCuts[0])
        else:
            for i in range(len(horizontalCuts)-1):
                maxh=max(maxh,horizontalCuts[i+1]-horizontalCuts[i])
        if(h-horizontalCuts[len(horizontalCuts)-1]>maxh or horizontalCuts[0]>maxh):
            maxh=max(h-horizontalCuts[len(horizontalCuts)-1],horizontalCuts[0])
        if (len(verticalCuts)==1):
            maxv=max(verticalCuts[0],w-verticalCuts[0])
        else:
            for i in range(len(verticalCuts)-1):
                maxv=max(maxv,verticalCuts[i+1]-verticalCuts[i])
        if(w-verticalCuts[len(verticalCuts)-1]>maxv or verticalCuts[0]>maxv):
            maxv=max(w-verticalCuts[len(verticalCuts)-1],verticalCuts[0])
        return(maxh*maxv%1000000007)
horizontalCuts=[ int(x.strip()) for x in input().split(",")]
verticalCuts=[ int(x.strip()) for x in input().split(",")]
h=int(input())
w=int(input())
print(maxArea(h,w,horizontalCuts,verticalCuts))