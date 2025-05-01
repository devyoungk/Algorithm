def find(A):
    for a in A:
        for i in range(0, N-M+1):
            s = a[i:i+M]
            if s == s[::-1]:
                return s

T = int(input())
for t in range(1, T+1):
    N, M = map(int,input().split())
    A = [input() for _ in range(N)]
    answer = find(A)
    
    if not answer:        
        B = []
        for j in range(N):
            x = ''
            for i in range(N):
                x += A[i][j]
            B.append(x)
        answer = find(B)
    
    print(f'#{t} {answer}')