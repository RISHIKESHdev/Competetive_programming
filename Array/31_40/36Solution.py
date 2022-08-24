def topKFrequent(nums, k):
        if len(nums) == 1:
            return [nums[0]]
        d = {}
        for num in nums:
            if num in d:
                d[num] += 1
            else:
                d[num] = 1
        h = []
        from heapq import heappush, heappop
        for key in d:
            heappush(h, (d[key], key))
            if len(h) > k:
                heappop(h)

        res = []
        while h:
            frq, item = heappop(h)
            res.append(item)
        return res