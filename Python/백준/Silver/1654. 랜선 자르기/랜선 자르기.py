K, N = map(int,input().split())
A = [int(input()) for _ in range(K)]
L = sum(A)//N
s, e = 1, L
while s <= e:
    x = (s+e)//2
    if sum(a//x for a in A) >= N:
        s = x + 1
    else:
        e = x - 1
print(e)