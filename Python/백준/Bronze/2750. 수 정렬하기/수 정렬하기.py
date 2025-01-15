n = int(input())
A = []
for _ in range(n):
    x = int(input())
    A.append(x)
A = sorted(A)
for a in A:
    print(a)