N = int(input())
A = list(map(int,input().split()))
B = sorted(set(A))
C = {}
i = 0
for b in B:
    C[b] = i
    i += 1

print(' '.join(str(C[a]) for a in A))