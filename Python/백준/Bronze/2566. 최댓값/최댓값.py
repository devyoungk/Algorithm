A = [None]*9
for i in range(9):
    A[i] = list(map(int,input().split()))
x, y = 0, 0
max = 0
for i in range(9):
    for j in range(9):
        if A[i][j] > max:
            max = A[i][j]
            x, y = i, j
print(max)
print(x+1, y+1)