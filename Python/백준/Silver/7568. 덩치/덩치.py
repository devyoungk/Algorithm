n = int(input())
A = []
for i in range(n):
    x, y = input().split()
    A.append([int(x), int(y)])
for i in range(n):
    rank = 1
    for j in range(n):
        if A[i][0] < A[j][0] and A[i][1] < A[j][1]:
            rank += 1
    A[i].append(rank)

for i in range(n):
    print(A[i][2], end=' ')