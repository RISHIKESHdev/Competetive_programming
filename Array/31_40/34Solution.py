class Combinations:
    def combine(self,n,k):
        self.n = n
        self.k = k
        self.results = []
        self.combo = 0
        self.comboSize = 0
        self.explore(0)
        self.ans=[]
        for x in self.results:
            self.ans.append(self.transform(x))
        return (self.ans)
    def transform(self, x):
        result = []
        for i in range(1, self.n + 1):
            mask = 1 << i
            if mask & x:
                result.append(i)
        return result
    def explore(self, idx):
        if self.comboSize == self.k:
            self.results.append(self.combo)
            return
        for x in range(idx, self.n):
            mask = 1 << (x + 1)
            self.comboSize += 1
            self.combo = self.combo | mask
            self.explore(x + 1)
            self.comboSize -= 1
            self.combo = self.combo & ~mask

n=int(input())
k=int(input())
obj=Combinations()
print(obj.combine(n,k))