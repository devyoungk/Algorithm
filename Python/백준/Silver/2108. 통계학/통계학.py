import sys
input = sys.stdin.readline

N = int(input())
A = {}
Z = []
sum = 0
if N == 1:
    n = int(input())
    print(n)
    print(n)
    print(n)
    print(0)
else:
    for _ in range(N):
        n = int(input())
        Z.append(n)
        sum += n
        if n in A:
            A[n] += 1
        else:
            A[n] = 1
    B = sorted(A.items(), key = lambda x: x[0])
    C = sorted(A.items(), key = lambda x: (-x[1], x[0]))
    D = sorted(Z)

    print(int(sum/N+0.5) if sum > 0 else int(sum/N-0.5))
    print(D[N//2])
    print(C[1][0] if C[1][1] == C[0][1] else C[0][0])
    print(B[-1][0]-B[0][0])