T = int(input())
for _ in range(1, T+1):
    N = int(input())
    A = [0 for _ in range(101)]
    S = list(map(int,input().split()))
    for s in S:
        A[s] += 1
    MAX = -1
    idx = -1
    for i in range(101):
        if MAX <= A[i]:
            MAX = A[i]
            idx = i
    print(f'#{N} {idx}')