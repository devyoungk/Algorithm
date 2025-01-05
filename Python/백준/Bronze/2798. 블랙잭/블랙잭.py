N, M = map(int,input().split())
A = sorted(list(map(int,input().split())))
MAX = 0
for i in range (N):
    for j in range(i+1,N):
        for k in range (j+1,N):
            SUM = A[i]+A[j]+A[k]
            if  MAX < SUM <= M:
                MAX = SUM
print(MAX)