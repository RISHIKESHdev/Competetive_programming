def merge(A,m,B,n):
        a, b, write_index = m-1, n-1, m + n - 1

        while b >= 0:
            if a >= 0 and A[a] > B[b]:
                A[write_index] = A[a]
                a -= 1
            else:
                A[write_index] = B[b]
                b -= 1

            write_index -= 1
A=[ int(x.strip()) for x in input().split(",")]
B=[ int(x.strip()) for x in input().split(",")]
print(merge(A,len(A),B,len(B)))