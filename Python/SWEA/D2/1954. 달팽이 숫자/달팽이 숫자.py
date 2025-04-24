T = int(input())
for t in range(1, T+1):
    N = int(input())
    A = [[-1 for _ in range(N)] for _ in range(N)]
    i = 0
    j = 0
    W = [[0,1], [1,0], [0, -1], [-1,0]]
    z = 0
    for x in range(1,N**2+1):
        A[i][j] = x
        ni = i + W[z][0]
        nj = j + W[z][1]
        if not -1< ni < N or not -1< nj < N or A[ni][nj] != -1:
            z = (z+1)%4
        i += W[z][0]
        j += W[z][1]
    print(f'#{t}')
    for a in A:
        print(' '.join(map(str,a)))