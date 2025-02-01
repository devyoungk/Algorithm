N, K = map(int,input().split())
A = [i for i in range(1, N+1)]
B = []
idx = K-1
for _ in range(N):
    B.append(str(A[idx]))
    A.pop(idx)
    idx += K-1
    if idx >= len(A) and A:
        idx %= len(A)

s = ', '.join(B)
print('<'+s+'>')