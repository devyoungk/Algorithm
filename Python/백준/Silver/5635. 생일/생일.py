n = int(input())
N = []
A = []
for _ in range(n):
    a, b, c, d = input().split()
    b, c, d = int(b), int(c), int(d)
    N.append(a)
    A.append(d*10000+c*100+b)

print(N[A.index(max(A))])
print(N[A.index(min(A))])