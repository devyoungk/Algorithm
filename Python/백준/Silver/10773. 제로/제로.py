K = int(input())
A = [int(input())]
for _ in range(K-1):
    n = int(input())
    if n == 0:
        A.pop(-1)
    else:
        A.append(n)
print(sum(A))