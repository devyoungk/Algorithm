N = int(input())
A = list(map(int,input().split()))
B = list(map(int,input().split()))

cost = 0
i = 0
while i < N-1:
    cost += A[i]*B[0]
    if B[0] > B[1]:
        B.pop(0)
    else:
        B.pop(1)
    i += 1

print(cost)