T = int(input())
for t in range(1, T+1):
    N, K = map(int,input().split())
    A = [input().split() for _ in range(N)]
    cnt = 0
    for i in range(N):
        cc = ''
        cr = ''
        for j in range(N):
            cc += A[i][j]
            cr += A[j][i]
        XC = cc.split('0')
        XR = cr.split('0')
        cnt += (XC.count('1'*K)+XR.count('1'*K))
    
    print(f'#{t} {cnt}')