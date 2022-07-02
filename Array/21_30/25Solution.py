def maxProfit(prices):
    left = 0
    right = 1
    max_profit = 0
    while right < len(prices):
        Profit = prices[right] - prices[left]
        if prices[left] < prices[right]:
            max_profit =max(Profit,max_profit)
        else:
            left = right
        right += 1
    return max_profit
prices=[ int(x.strip()) for x in input().split(",")]
print(maxProfit(prices))