N = int(input())
A = list(map(int,input().split()))
B = sorted(A)
C = {}
i = 0
for b in B:
    if b not in C:
        C[b] = i
        i += 1
D = [C[a] for a in A]
print(' '.join(map(str,D)))