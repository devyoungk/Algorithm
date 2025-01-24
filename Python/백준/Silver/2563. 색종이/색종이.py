n = int(input())
A = [[0]*100 for _ in range(100)]
cnt = 0
for _ in range(n):
    x, y = map(int,input().split())
    for i in range(x,x+10):
        for j in range(y,y+10):
            if A[i][j] == 0:
                A[i][j] = 1
                cnt += 1
print(cnt)