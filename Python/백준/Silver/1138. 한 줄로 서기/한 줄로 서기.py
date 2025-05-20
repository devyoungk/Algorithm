N = int(input())
A = [None]*N
S = list(map(int,input().split()))

for i in range(len(S)):
    x = S[i]+1
    cnt = 0
    for j in range(len(A)):
        if not A[j]:
            cnt += 1
        if x == cnt:
            A[j] = str(i+1)
            break
print(' '.join(A))