N, K = map(int,input().split())
A = list(map(int,input().split()))
Max = sum(A[:K])
x = sum(A[:K])
for i in range(N-K):
    x += A[i+K]-A[i]
    Max = max(x, Max)
print(Max)