n =int(input())
r = [None] * n
for i in range (n):
    A = sorted(list(map(int,input().split())))
    B = set(A)
    if len(B) == 1:
        r[i] = A[1]*1000 + 10000
    elif len(B) == 2:
        r[i] = A[1]*100 + 1000
    else:
        r[i] = A[2]*100

print(max(r))