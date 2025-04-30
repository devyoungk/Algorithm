T = int(input())
for t in range(1, T+1):
    N = int(input())
    S = input()
    A = [0] * 10
    for s in S:
        A[9-int(s)] += 1
    print(f'#{t} {9-A.index(max(A))} {max(A)}')