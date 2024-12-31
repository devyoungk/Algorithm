L, P = map(int,input().split())
A = list(map(int,input().split()))

for i in range(len(A)):
    print(A[i]-L*P, end=" ")