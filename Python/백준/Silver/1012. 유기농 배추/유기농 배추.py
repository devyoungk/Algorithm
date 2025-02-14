import sys
sys.setrecursionlimit(10000)

def check(i, j):
    if i < 0 or i >= N or j < 0 or j >= M or A[i][j] != 1:
        return
    A[i][j] = 'C'
    check(i-1, j)
    check(i+1, j)
    check(i, j-1)
    check(i, j+1)

T = int(input())
for _ in range(T):
    M, N, K = map(int,input().split())
    A = [[0 for _ in range(M)] for _ in range(N)]
    for _ in range(K):
        x, y = map(int,input().split())
        A[y][x] = 1
    
    cnt = 0
    for i in range(N):
        for j in range(M):
            if A[i][j] == 1:
                check(i, j)
                cnt += 1
                 
    print(cnt)