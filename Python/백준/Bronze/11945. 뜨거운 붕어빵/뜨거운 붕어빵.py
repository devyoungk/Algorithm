N, M = map(int,input().split())
for i in range (N):
    S = input()
    for j in range(M):
        print(S[M-1-j],end="")
    print()
