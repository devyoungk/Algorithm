n = int(input())
A = []
for i in range(n):
    x, y = input().split()
    A.append([int(x), int(y)])
B = []
for i in range(n):
    rank = 1
    for j in range(n):
        if A[i][0] < A[j][0] and A[i][1] < A[j][1]:
            rank += 1
    B.append(rank)

print(*B)