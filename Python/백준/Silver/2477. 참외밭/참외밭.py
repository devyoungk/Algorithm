K = int(input())
A = []
lr = []
ud = []
for _ in range(6):
    d, l = map(int,input().split())
    A.append(l)
    if d in (1,2):
        lr.append(l)
    else:
        ud.append(l)
x = max(A)
I = A.index(x)
A = A[I:]+A[:I]
if A[0] == max(lr):
    B = ud
else:
    B = lr
y = max(B)
if A[1] == y:
    area = x*y - A[3]*A[4]
else:
    area = x*y - A[2]*A[3]
print(K*area)