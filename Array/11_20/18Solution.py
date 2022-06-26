def maxScore(cardPoints,k):
        sub_sum = answer = sum(cardPoints[:k])
        left = k-1
        right = len(cardPoints) - 1
        for i in range(k):
            sub_sum += cardPoints[right] - cardPoints[left] 
            left -= 1
            right -= 1
            answer = max(answer, sub_sum)
        return answer
cardPoints=[int(x.strip()) for x in input().split(",")]
k=int(input())
